package com.sp.bdi.test.test1;

import lombok.Data;

@Data
public class Human {
	private String name;
	Integer age;

	public Human() {
		System.out.println("난 언제 생성될까?");
	}

}
