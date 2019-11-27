package com.sp.bdi.test.test1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Execute {
	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/resources/ioc/ioc-1.xml");
		BeanFactory bf = new XmlBeanFactory(fsr);
		Cat c = (Cat) bf.getBean("c");
		List<Cat> catList = new ArrayList<Cat>();
		catList.add((Cat) bf.getBean("c"));
		catList.add((Cat) bf.getBean("c"));
		catList.add((Cat) bf.getBean("c"));
		c.setAge(20);
		System.out.println(catList);
	}
}
