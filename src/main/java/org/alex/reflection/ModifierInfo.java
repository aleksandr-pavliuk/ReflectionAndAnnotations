package org.alex.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Alex
 * @link https://intvw.me
 */
public class ModifierInfo {

  public static void main(String[] args) throws NoSuchMethodException {

    Entity e = new Entity(10,"id");
    Class<? extends Entity> clss = e.getClass();
    int modifiersInt = clss.getModifiers();
    int i = modifiersInt & Modifier.PUBLIC;
    boolean isPublicClass = Modifier.isPublic(modifiersInt);

    System.out.println(Modifier.toString(modifiersInt));

    Method method= clss.getMethod("getVal");
    int methodModifiers = method.getModifiers();
    boolean ispubMethod =Modifier.isPublic(methodModifiers);

    System.out.println(Modifier.toString(methodModifiers));
  }
}
