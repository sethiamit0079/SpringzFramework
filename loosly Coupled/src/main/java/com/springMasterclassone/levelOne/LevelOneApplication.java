package com.springMasterclassone.levelOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LevelOneApplication {

	public static void main(String[] args) {
		
		binarySearch bin = new binarySearch(new BubbleSort());
		int res = bin.binSearch(new int[] {1,2,3,4}, 3);
		System.out.println(res);
		
		
		SpringApplication.run(LevelOneApplication.class, args);
	}

}
