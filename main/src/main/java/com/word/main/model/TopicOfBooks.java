package com.word.main.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


//@RestController
//@Component
@Document(value = "topic")
public class TopicOfBooks {

    @Id
    private String id;
    private String name;
    private String writer;

    public TopicOfBooks( String name, String writer) {
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