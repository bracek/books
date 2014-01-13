package com.javapapers.designpattern.command;

public class OnCommand implements Command {

	private ConsumerElectronics ce;

	public OnCommand(final ConsumerElectronics ce) {
		this.ce = ce;
	}

	public void execute() {
		ce.on();
	}
}
