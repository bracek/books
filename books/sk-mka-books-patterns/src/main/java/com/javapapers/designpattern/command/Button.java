package com.javapapers.designpattern.command;

public class Button {
	Command c;

	public Button(final Command c) {
		this.c = c;
	}

	public void click(){
		c.execute();
	}
}
