package com.word.main.controller;

import com.word.springtopic.TopicOfBooks;
import com.word.springtopic.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.lang.String;

public class Maincontroller {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<TopicOfBooks> getAllTopics() {
            return topicService.getTopic();
        }
}

//    @GetMapping("/")
//    public String line(Model first){
//        first.addAttribute("name", "Leonid");
//        first.addAttribute("array", Ar());
//        return "index";
//    }
//    public int[] Ar(){
//        int[] arr = {1,2,3,3};
//        return arr;
//    }

