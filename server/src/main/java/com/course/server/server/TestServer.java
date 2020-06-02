package com.course.server.server;

import com.course.server.domain.Test;
import com.course.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServer {

    @Resource
    private TestMapper testMapper;

    public List<Test> lists(){
      return testMapper.lists();
    }
}
