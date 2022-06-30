package com.example.atomic.controller;

import com.example.atomic.service.AtomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ckn
 * @date 2022/6/30
 */
@RestController
@RequestMapping("/atomic")
public class AtomicController {
    @Autowired
    AtomicService atomicService;

    @GetMapping("/test")
    public String test() {
        atomicService.test();
        return "success";
    }
}
