package com.course.server.server;

import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServer {

    @Resource
    private TestMapper testMapper;

    public List<Test> lists(){
        //查询所有
        //return testMapper.selectByExample(null);
        //根据条件查询
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo("1");
        testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);
    }
}
