package com.sp.bdi.test.test5;

import org.springframework.stereotype.Component;

@Component("lol")
public class LOL implements Game {

	@Override
	public void on() {
		System.out.println("LOL실행");
	}
	
	@Override
	public void play() {
		System.out.println("LOL실행");
	}

	@Override
	public void off() {
		System.out.println("LOL실행");
	}

}
