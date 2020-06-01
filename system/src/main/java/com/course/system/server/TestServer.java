package com.course.system.server;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
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
