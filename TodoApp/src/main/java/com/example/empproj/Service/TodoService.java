package com.example.empproj.Service;

import java.util.List;

import com.example.empproj.Model.Todo;

public interface TodoService {

	 void insert(Todo todo);

	void delete(String deleteId);
    
	List<Todo> fetch();

	void upd(Todo todo, String id);

}
