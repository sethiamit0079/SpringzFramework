package com.mockito;



public class springBusineesImpl {

	//dependency of businessService 
private DataService service;

public springBusineesImpl(DataService service) {
	super();
	this.service = service;
}

int findGreatest() {
	int[] data = service.retriveAllData();
	int great = Integer.MIN_VALUE;
	
	for(int val : data) {
		if(val > great) {
			great = val;
		}
	}
	
	return great;
}
}


