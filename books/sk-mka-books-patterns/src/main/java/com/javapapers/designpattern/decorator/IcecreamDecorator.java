package com.javapapers.designpattern.decorator;

/**
 * User: katrami
 * Date: 12/12/13
 * Time: 9:27 AM
 */
public abstract class IcecreamDecorator implements Icecream {
  protected Icecream specialIcecream;

  public IcecreamDecorator(Icecream specialIcecream) {
    this.specialIcecream = specialIcecream;
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream();
  }
}