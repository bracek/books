package com.javapapers.designpattern.command;

import java.util.List;

public class MuteAllCommand implements Command {
	List<ConsumerElectronics> ceList;

	public MuteAllCommand(final List<ConsumerElectronics> ceList) {
		this.ceList = ceList;
	}

	@Override
	public void execute() {

		for (ConsumerElectronics ce : ceList) {
			ce.mute();
		}

	}
}
