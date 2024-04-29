package com.example.empproj.RepoSitory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.empproj.Model.Todo;

public interface TodoRepo extends MongoRepository<Todo,String>{

}
