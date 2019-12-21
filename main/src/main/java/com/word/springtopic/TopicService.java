package com.word.springtopic;

import com.word.springtopic.TopicOfBooks;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicOfBooks> topic = Arrays.asList(
                new TopicOfBooks(01, "The Adventures of Tom Sawyer", "Mark Twain"),
                new TopicOfBooks(02, "The Catcher in the Rye", "David Salinger")
        );

    public List<TopicOfBooks> getTopic() {
        return topic;
    }
}