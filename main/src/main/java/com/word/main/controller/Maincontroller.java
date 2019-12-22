package com.word.main.controller;

import com.word.main.TopicOfBooks;
import com.word.main.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Maincontroller {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<TopicOfBooks> getAllTopics() {
        return topicService.getTopic();
    }

    public TopicOfBooks getTopic(String id){
        return topicService.ChooseTopic(id);
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

