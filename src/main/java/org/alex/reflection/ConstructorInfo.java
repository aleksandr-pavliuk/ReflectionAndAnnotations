package org.alex.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Alex
 * @link https://intvw.me
 */
public class ConstructorInfo {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

    Class<?> clss = Class.forName("org.alex.reflection.Entity");
		Constructor<?>[] constructors1 = clss.getConstructors();
    Constructor<?>[] constructors2 = clss.getDeclaredConstructors();

    System.out.println("getConstructors() :");
    for (Constructor<?> constructor : constructors1) {
      System.out.println(constructor);
    }
    System.out.println("----------------------");

    System.out.println("getDeclaredConstructors() :");
    for (Constructor<?> constructor : constructors2) {
      System.out.println(constructor);
    }
    System.out.println("----------------------");

    Constructor<?> publicConstructor = clss.getConstructor(int.class, String.class);
    Entity e = (Entity)publicConstructor.newInstance(10, "StudenId");
    System.out.println(e.getVal() +" "+e.getType());

    Constructor<?> privateConstructor = clss.getDeclaredConstructor();
    privateConstructor.setAccessible(true);
    Entity defaultE = (Entity)privateConstructor.newInstance();

    System.out.println(defaultE.getType()+" "+defaultE.getVal());

  }

}
