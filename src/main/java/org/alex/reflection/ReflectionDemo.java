package org.alex.reflection;

import java.lang.reflect.Constructor;

/**
 * @author Alex
 * @link https://intvw.me
 */
public class ReflectionDemo {

  public static void main(String[] args) throws Exception {
    Class<?> clss = Class.forName("org.alex.reflection.MyClass");
    Constructor<?> con = clss.getDeclaredConstructor();
    con.setAccessible(true);
    MyClass newInstance = (MyClass) con.newInstance();
  }
}


class MyClass{
  private MyClass(){
    System.out.println("MyClass object created!");
  }
}