/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.herout.pavel.s14.ss02;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 
 * @author bracek
 */
public class Bird extends Animal {

	private int windsLenght;

	public Bird(final String type, final int windsLenght) {
		super(type);
		this.windsLenght = windsLenght;
	}

	@Override
	public void listingInfo() {
		super.listingInfo();
		System.out.println("windsLenght = " + windsLenght);
	}

	/**
	 * Get the value of windsLenght
	 * 
	 * @return the value of windsLenght
	 */
	public int getWindsLenght() {
		return windsLenght;
	}

	/**
	 * Set the value of windsLenght
	 * 
	 * @param windsLenght
	 *            new value of windsLenght
	 */
	public void setWindsLenght(final int windsLenght) {
		this.windsLenght = windsLenght;
	}

	private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
			this);

	/**
	 * Add PropertyChangeListener.
	 * 
	 * @param listener
	 */
	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * Remove PropertyChangeListener.
	 * 
	 * @param listener
	 */
	public void removePropertyChangeListener(
			final PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

}
