package org.alex.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Alex
 * @link https://intvw.me
 */
public class MethodInfo {

  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Entity e = new Entity(10, "id");

    Class<? extends Entity> clss = e.getClass();

    Method[] methods = clss.getMethods();

    System.out.println("getMethods() :");
    for (Method method : methods) {
      System.out.println(method.getName());
    }
    System.out.println("----------------------");

    System.out.println("getDeclaredMethods() :");
    Method[] declaredMethods = clss.getDeclaredMethods();
    for (Method method : declaredMethods) {
      System.out.println(method.getName());
    }
    System.out.println("----------------------");

    Method method = clss.getDeclaredMethod("setVal", int.class);
    method.setAccessible(true);
    method.invoke(e, 15);

    Method method2 = clss.getMethod("getVal", null);
    System.out.println(method2.invoke(e, null));
  }

}
