package com.word.main.service;

import com.word.main.model.TopicOfBooks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicOfBooks> topic = new ArrayList<>(Arrays.asList(
            new TopicOfBooks(1,"The Adventures of Tom Sawyer", "Mark Twain"),
            new TopicOfBooks( 2,"The Catcher in the Rye", "David Salinger")
        ));

    public List<TopicOfBooks> getTopic() {
        return topic;
    }

    public TopicOfBooks ChooseTopic(String id){
        return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(TopicOfBooks topicOfBooks) {
        topic.add(topicOfBooks);
    }

    public void updateTopic(String id, TopicOfBooks topicOfBooks) {
        for (int i = 0; i < topic.size(); i++) {
            TopicOfBooks t = topic.get(i);
            if (t.getId().equals(id)){
                topic.set(i, topicOfBooks);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topic.removeIf(t -> t.getId().equals(id));
    }
}
