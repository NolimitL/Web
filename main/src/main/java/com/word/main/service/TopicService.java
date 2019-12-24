package com.word.main.service;

import com.word.main.model.ITopicRepository;
import com.word.main.model.TopicOfBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private ITopicRepository iTopicRepository;
//
//    private List<TopicOfBooks> topic = new ArrayList<>(Arrays.asList(
//            new TopicOfBooks(1,"The Adventures of Tom Sawyer", "Mark Twain"),
//            new TopicOfBooks( 2,"The Catcher in the Rye", "David Salinger")
//    ));

    public List<TopicOfBooks> getTopic() {
        return iTopicRepository.findAll();
    }

    public TopicOfBooks ChooseTopic(String id){
        //topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return iTopicRepository.findById(id).get();
    }

    public void addTopic(TopicOfBooks topicOfBooks) {
        iTopicRepository.save(topicOfBooks);
    }

    public void updateTopic(String id, TopicOfBooks topicOfBooks) {
        iTopicRepository.save(topicOfBooks);
//        for (int i = 0; i < topic.size(); i++) {
//            TopicOfBooks t = topic.get(i);
//            if (t.getId().equals(id)){
//                topic.set(i, topicOfBooks);
//                return;
//            }
//        }
    }

    public void deleteTopic(String id) {
        iTopicRepository.deleteById(id);
//        topic.removeIf(t -> t.getId().equals(id));
    }
}
