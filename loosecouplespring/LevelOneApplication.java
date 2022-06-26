package com.springMasterclassone.levelOne;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;



//where to search >? componentscan but springBootapp automatically scan package 
// and subpackage of the package where it is in.

@SpringBootApplication  
@Component
public class LevelOneApplication {
	
//	@Autowired    wrong 
//	
//	@Autowired
//	static
// binarySearch bin2;
//	
//	@Autowired
//	static
//	  binarySearch b2;
//
//	  @Bean
//	  binarySearch binarySearch() {
//		  return binarySearch();
//	  }
//	
	
	private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(LevelOneApplication.class); 

	public static void main(String[] args) {
		
		//answer these Qf of spring 
		//what are the beans ?
		//what are dependencies of bean ? sortlago dep of binarysearch class 
		//where to search for beans ?
		
		
		
		//binarySearch bin = new binarySearch(new BubbleSort());
		//need to get bean from aplication context  spring create many beans
		
		
		//run method return application context 
		ApplicationContext applicationContext =   SpringApplication.run(LevelOneApplication.class, args);
		
		
		//same as @autowire but here developer is incharge
	binarySearch bin = applicationContext.getBean(binarySearch.class);
	
	binarySearch bin2 = applicationContext.getBean(binarySearch.class);
		
		//binarySearch b = new binarySearch();
	
		System.out.println(bin);
		System.out.println(bin2);
		int res = bin.binSearch(new int[] {1,2,3,4}, 3);
		System.out.println(res);
		
	//	System.out.println(bin2);
		
		
		System.out.println("logggger");
		LOGGER.info("{}",bin);
		
		
		
	}
}
