package com.springMasterclassone.levelOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//binary search depends on sortAlgo 
@Component 
@Scope("prototype")
public class binarySearch {
	
	//this is dependency of bean binarysearch   
	//uses setter injection 
	@Autowired   
	private sortAlgo sortA;
	
	
	
	
//	
//	public binarySearch(sortAlgo sortA) {
//	super();
//	this.sortA = sortA;
//	}



	public sortAlgo getSortA() {
		return sortA;
	}




	public void setSortA(sortAlgo sortA) {
		this.sortA = sortA;
	}




	public int binSearch(int [] numbers, int numberToSearch) {
		
		//search array
		//return the result
	//sortAlgo a = new BubbleSort();
	int[] sortedNUmbers = sortA.sort(numbers);
	System.out.println(sortA);
		return 3;
	}
	
	
	
}
