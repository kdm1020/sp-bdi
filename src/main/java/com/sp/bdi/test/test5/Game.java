package com.sp.bdi.test.test5;

import org.springframework.stereotype.Component;

@Component("game")
public interface Game {

	public void on();
	public void play();
	public void off();
}
