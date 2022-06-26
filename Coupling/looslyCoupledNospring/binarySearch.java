package com.springMasterclassone.levelOne;

public class binarySearch {
	
	private sortAlgo sortA;
	
	
	
	public binarySearch(sortAlgo sortA) {
		super();
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
