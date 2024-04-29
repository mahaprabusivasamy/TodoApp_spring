package com.example.empproj.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Todo")
public class Todo {
     
	@Id
	private String id;
	private String message;
	private String enddate;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	  public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }
	Todo(){
		
	}
}
