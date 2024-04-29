package com.example.empproj.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.empproj.Model.Todo;
import com.example.empproj.Service.TodoService;

@RestController
public class TodoController {

	@Autowired
	TodoService todoservice;
	
	@PostMapping("/add/data")
	public String insert(@RequestBody Todo todo) {
		 todoservice.insert(todo);
		 return "data insert sucessfully";
	}
	
	@DeleteMapping("/delete/{_id}")
	public String delete(@PathVariable("_id") String deleteId) {
		todoservice.delete(deleteId);
		return "Deleted sucessfully";
		
	}
	@GetMapping("/get/data")
	public List<Todo> fetch(){
		return todoservice.fetch();
		
	}
	@PutMapping("/update/{_id}")
	public String update(@RequestBody Todo todo,@PathVariable("_id") String id) {
		todoservice.upd(todo,id);
		return "updated sucessfulyy";
	}
}
