package com.example.atomic.service.impl;

import com.example.atomic.entity.Student;
import com.example.atomic.entity.User;
import com.example.atomic.mapper.master.StudentMapper;
import com.example.atomic.mapper.salve.UserMapper;
import com.example.atomic.service.AtomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author ckn
 * @date 2022/6/30
 */
@Service
public class AtomicServiceImpl implements AtomicService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional
    public void test() {
        Student student = new Student();
        student.setName("周煌华");
        student.setCode(UUID.randomUUID().toString());
        studentMapper.insert(student);
      //  int i=1/0;
        User user = new User();
        user.setUsername(UUID.randomUUID().toString());
        user.setPassword("10009169");
        userMapper.insert(user);
    }
}
