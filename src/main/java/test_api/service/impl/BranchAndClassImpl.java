package test_api.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test_api.mapper.BranchMapper;
import test_api.mapper.ClassMapper;
import test_api.models.Branch;
import test_api.models.Class;

@Service
public class BranchAndClassImpl {
    @Autowired
    private MybatisAutoConfiguration config;
    @Autowired
    private BranchMapper branchMapper;
    @Autowired
    private ClassMapper classMapper;

    public Map<String, List<? extends Object>> getAllData() {
        Map<String, List<? extends Object>> data = new HashMap<>();

        List<Branch> branches = branchMapper.getAll();
        List<Class> classes = classMapper.showAllClass();

        data.put("branches", branches);
        data.put("classes", classes);

        return data;
    } 
}
