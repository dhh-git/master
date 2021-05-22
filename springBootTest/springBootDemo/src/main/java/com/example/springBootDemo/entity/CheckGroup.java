package com.example.springBootDemo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CheckGroup {
    private int id;
    private int code;
    private String name;
    private String helpCode;
    private String sex;
    private String remark;
    private String attention;
}
