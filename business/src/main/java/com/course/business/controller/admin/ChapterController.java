package com.course.business.controller.admin;

import com.course.server.dto.ChapterDto;
import com.course.server.server.ChapterServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterServer chapterServer;

    @RequestMapping("/chapter")
    public List<ChapterDto> chapter(){
        return chapterServer.lists();
    }
}
