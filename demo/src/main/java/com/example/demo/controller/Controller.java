package com.example.demo.controller;

import com.example.demo.entiry.User;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LIUBAIHUI
 * @date 2019/11/9
 */
@RestController
public class Controller {
    @Autowired
    private TestRepository testRepository;
    @GetMapping(value = "save")
    public void save(){
        User user=new User();
        user.setName("小明").setAddress("北京市");
        testRepository.save(user);
    }
}
