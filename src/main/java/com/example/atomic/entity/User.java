package com.example.atomic.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:06
 */
@Data
public class User implements Serializable {

    private Long id;

    private String username;

    private String password;
}
