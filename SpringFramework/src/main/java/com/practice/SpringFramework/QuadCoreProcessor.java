package com.practice.SpringFramework;

import org.springframework.stereotype.Component;

@Component
public class QuadCoreProcessor implements Processor {

	public void doProcess() {
		System.out.println("Quad Core processor");

	}

}
