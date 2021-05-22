package com.example.springBootDemo.controller;

import com.example.springBootDemo.entity.CheckGroup;
import com.example.springBootDemo.service.CheckGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CheckGroupController {
    @Autowired
    private CheckGroupService service;

    @RequestMapping("/queryAll")
    public List<CheckGroup> queryAll(){
        return service.queryAll();
    }
}
