package com.sp.bdi.test.test3;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("bob")
@Data
public class Bob extends Food{
	private String name;
	private Integer price;
}
