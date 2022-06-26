package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class laptop {
	private int id;
	@Override
	public String toString() {
		return "laptop [id=" + id + ", brand=" + brand + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String brand;
	
	public void compile() {
		System.out.println("compilling");
	}
}
