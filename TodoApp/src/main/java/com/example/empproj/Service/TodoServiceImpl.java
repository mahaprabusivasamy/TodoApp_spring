package com.example.empproj.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empproj.Model.Todo;
import com.example.empproj.RepoSitory.TodoRepo;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoRepo todoRepo;
	
	public void insert(Todo todo) {
		todoRepo.save(todo);
		
	}
	public void delete(String deleteId) {
		todoRepo.deleteById(deleteId);
	}
	public List<Todo> fetch() {
		
		return (List<Todo>) todoRepo.findAll();
	}
	
	public void upd(Todo todo,String id) {
		Todo existingTodo= todoRepo.findById(id).orElse(null);
		if(existingTodo!=null) {
			BeanUtils.copyProperties(todo, existingTodo,"id");
			todoRepo.save(existingTodo);
		}
		
	}
	
	
	
}
