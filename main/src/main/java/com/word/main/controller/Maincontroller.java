package com.word.main.controller;

import com.word.main.model.TopicOfBooks;
import com.word.main.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin // эта аннотация принимает запрос
@RestController
public class Maincontroller {

    @Autowired                   //Авто-связь с классами
    private TopicService topicService;

    @RequestMapping("/topic")           //@RequestMapping - отображение запроса (Request-запрос, Mapping-отображение)
    public List<TopicOfBooks> getAllTopics() {
        return topicService.getTopic();
    }
    @RequestMapping("/topic/{amountbook}")
    public TopicOfBooks getTopic(@PathVariable("amountbook") String id){  //@PathVariable - подходящая переменная из ссылки переводиться в вводимый параметр
        return topicService.ChooseTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topic")      //вызывает метод из аннотации
    public void addTopicOfBook(@RequestBody TopicOfBooks topicOfBooks){
        topicService.addTopic(topicOfBooks);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{amountbook}") //вызывает метод из аннотации
    public void updateTopicOfBook(@RequestBody TopicOfBooks topicOfBooks, @PathVariable("amountbook") String id){
        topicService.updateTopic(id, topicOfBooks);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{amountbook}")
    public void deleteTopic(@PathVariable("amountbook") String id) {
         topicService.deleteTopic(id);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/topic/name/{name}")
    public TopicOfBooks findName(@PathVariable("name") String name){
        return topicService.findName(name);
    }
}

//    @GetMapping("/")
//    public String line(Mod    el first){
//        first.addAttribute("name", "Leonid");
//        first.addAttribute("array", Ar());
//        return "index";
//    }
//    public int[] Ar(){
//        int[] arr = {1,2,3,3};
//        return arr;
//    }
