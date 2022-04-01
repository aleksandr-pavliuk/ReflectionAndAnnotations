package org.alex.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Alex
 * @link https://intvw.me
 */
@Retention(RUNTIME)
@Target(ElementType.TYPE)
public @interface Designations {

  public Designation[] value();

}
