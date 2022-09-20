package com.list.project.listProject.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.list.project.listProject.model.Todo;

@Service
public class LoginService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount=3;
	
	static {
        todos.add(new Todo(1, "amit", "Learn Spring MVC",
                false));
        todos.add(new Todo(2, "amit", "Learn Struts", false));
        todos.add(new Todo(3, "amit", "Learn Hibernate",
                false));
    }
	

	 public List<Todo> geTodo() {
	        return todos;
	    }
	    

	 public Todo geTodoOne(int id) {
		 Todo value=null;
		 ListIterator<Todo>iterator = todos.listIterator();
			while(iterator.hasNext()) {
				Todo todo = iterator.next();
				if(todo.getId() == id) {
				value = todo;
				break;
				}
			}
			return value;
	    }
	    
	 
	 public Todo addTo(Todo input) {
		 todos.add(input);
		return input;
	 }


	    

}
