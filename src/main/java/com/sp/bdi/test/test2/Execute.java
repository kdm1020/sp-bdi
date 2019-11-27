package com.sp.bdi.test.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc/ioc-2.xml");
		CarMaker cm = (CarMaker) ac.getBean("carMaker");
		System.out.println(cm.makeCar());
		
		
	}
}
