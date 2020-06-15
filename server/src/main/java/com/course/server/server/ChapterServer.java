package com.course.server.server;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.dto.ChapterDto;
import com.course.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterServer {

    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDto> lists(){
        //查询所有
        //return chapterMapper.selectByExample(null);
        //根据条件查询
        ChapterExample chapterExample = new ChapterExample();
//        chapterExample.createCriteria().andIdEqualTo("111");
        chapterExample.setOrderByClause("id desc");
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDto> chapterDtoList = new ArrayList<>();
        for (int i = 0; i <chapterList.size() ; i++) {
            Chapter chapter = chapterList.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtoList.add(chapterDto);
        }
        return chapterDtoList;
    }
}
