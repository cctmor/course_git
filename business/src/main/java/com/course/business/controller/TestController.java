package com.course.business.controller;

import com.course.server.domain.Test;
import com.course.server.server.TestServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestServer testServer;

    @RequestMapping("/test")
    public List<Test> test(){
        return testServer.lists();
    }
}
