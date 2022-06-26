package com.springMasterclassone.levelOne;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //this is bean 
@Primary
public class BubbleSort implements sortAlgo {
	//no dependency 
	
	public int[] sort(int [] numbers) {
		//logic bubbles ort 
		return numbers;
	}
}
