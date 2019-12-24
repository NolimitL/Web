package com.word.main.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITopicRepository extends CrudRepository<TopicOfBooks, String> {
    List<TopicOfBooks> findAll();
    TopicOfBooks findById();
    TopicOfBooks findByName(String name);
}