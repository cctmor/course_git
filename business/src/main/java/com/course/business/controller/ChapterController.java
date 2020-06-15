package com.course.business.controller;

import com.course.server.domain.Chapter;
import com.course.server.server.ChapterServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ChapterController {

    @Resource
    private ChapterServer chapterServer;

    @RequestMapping("/chapter")
    public List<Chapter> chapter(){
        return chapterServer.lists();
    }
}
