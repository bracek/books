package com.javapapers.designpattern.decorator;

/**
 * User: katrami
 * Date: 12/12/13
 * Time: 9:29 AM
 */
public class NuttyDecorator extends IcecreamDecorator {

  public NuttyDecorator(final Icecream specialIcecream) {
    super(specialIcecream);
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream() + addNuts();
  }

  private String addNuts() {
    return " + cruncy nuts";
  }
}
