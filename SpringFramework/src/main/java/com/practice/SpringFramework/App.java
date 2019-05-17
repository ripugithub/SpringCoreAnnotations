package com.practice.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * @author Ripu
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(MyConfig.class);
    	Lenovo comp = factory.getBean(Lenovo.class);
    	comp.processor();
    	comp.startProcessing();
    	
    }
}
