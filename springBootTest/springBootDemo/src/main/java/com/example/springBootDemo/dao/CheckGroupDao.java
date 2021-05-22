package com.example.springBootDemo.dao;

import com.example.springBootDemo.entity.CheckGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CheckGroupDao {
    public List<CheckGroup> queryAll();
}
