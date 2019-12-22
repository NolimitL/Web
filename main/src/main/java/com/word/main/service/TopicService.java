package com.word.main.service;

import com.word.main.model.TopicOfBooks;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicOfBooks> topic = Arrays.asList(
                new TopicOfBooks(1,"The Adventures of Tom Sawyer", "Mark Twain"),
                new TopicOfBooks( 2,"The Catcher in the Rye", "David Salinger")
        );

    public List<TopicOfBooks> getTopic() {
        return topic;
    }

    public TopicOfBooks ChooseTopic(String id){
        return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
