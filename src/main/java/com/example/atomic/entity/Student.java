package com.example.atomic.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 学生实体类
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:06
 */
@Data
public class Student implements Serializable {

    private Long id;

    private String name;

    private String code;
}
