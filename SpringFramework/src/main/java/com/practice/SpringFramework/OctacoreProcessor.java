package com.practice.SpringFramework;

import org.springframework.stereotype.Component;

@Component
public class OctacoreProcessor implements Processor{

	public void doProcess() {
		System.out.println("Processing started on Octacore processor");
		
	}

}
