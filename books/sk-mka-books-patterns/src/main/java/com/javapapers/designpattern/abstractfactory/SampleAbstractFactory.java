package com.javapapers.designpattern.abstractfactory;

public class SampleAbstractFactory {

	public static void main(final String args[]) {
		new Wonderland(createAnimalFactory("water"));
	}

	public static AnimalFactory createAnimalFactory(final String type) {
		if ("water".equals(type))
			return new SeaFactory();
		else
			return new LandFactory();
	}
}
