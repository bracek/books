package com.javapapers.designpattern.decorator;

/**
 * User: katrami
 * Date: 12/12/13
 * Time: 9:30 AM
 */
public class TestDecorator {


  public static void main(final String args[]) {
    Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
    System.out.println(icecream.makeIcecream());
  }
}
