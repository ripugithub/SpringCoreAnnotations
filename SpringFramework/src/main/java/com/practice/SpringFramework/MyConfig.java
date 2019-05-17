package com.practice.SpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ripu
 *
 */
@Configuration
@ComponentScan(basePackages="com.practice.SpringFramework")
public class MyConfig {
	/*you can get away with the @Bean definitions below if you use @Component on the classes 
	which are supposed to be used as beans in this project OctacoreProcessor and QuadCoreProcessor*/
	
	/*@Bean   //Bean tags are replacements for the bean definitions defined through xml configurations
	public Lenovo getComputer()
	{
		return new Lenovo();
	}

	@Bean
	public Processor getProcessor()
	{
		return new OctacoreProcessor();
	}*/
}
