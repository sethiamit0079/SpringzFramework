
package com.springBootbaic.spring;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class booksController {

	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
	return Arrays.asList(new Book(1,"masterSpring","sethi"));
	}
}
