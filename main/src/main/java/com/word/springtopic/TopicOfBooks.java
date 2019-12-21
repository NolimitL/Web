package com.word.springtopic;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicOfBooks {

    private String id;
    private String name;
    private String writer;

    public TopicOfBooks(int id, String name, String writer) {
        this.id = Integer.toString(id);
        this.name = name;
        this.writer = writer;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = Integer.toString(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}