package com.example.springBootDemo.service;

import com.example.springBootDemo.dao.CheckGroupDao;
import com.example.springBootDemo.entity.CheckGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CheckGroupService {

    @Autowired
    private CheckGroupDao mapper;

    public List<CheckGroup> queryAll(){
        return mapper.queryAll();
    }
}
