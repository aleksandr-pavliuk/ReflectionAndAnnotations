package org.alex.annotation;

import static java.lang.annotation.ElementType.TYPE_PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Alex
 * @link https://intvw.me
 */
@Retention(RUNTIME)
@Target({ TYPE_PARAMETER, TYPE_USE })
public @interface ReadOnly {

}
