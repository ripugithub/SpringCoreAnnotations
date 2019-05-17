package com.practice.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Lenovo implements Computer {
	
	@Autowired
	@Qualifier("octacoreProcessor")
	Processor processor;
	public void processor() {
		System.out.println("Octa core processor");

	}
	public void ram() {
		System.out.println("16 GB RAM");
	}
	
	public void startProcessing()
	{
		processor.doProcess();
	}

}
