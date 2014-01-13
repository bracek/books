package com.javapapers.designpattern.decorator;

/**
 * User: katrami
 * Date: 12/12/13
 * Time: 9:30 AM
 */
public class HoneyDecorator extends IcecreamDecorator {
  public HoneyDecorator(final Icecream specialIcecream) {
    super(specialIcecream);
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream() + addHoney();
  }

  private String addHoney() {
    return " + sweet honey";
  }

}
