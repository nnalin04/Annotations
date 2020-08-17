package com.dummyproject;

import java.lang.annotation.*;

/*
*@Documented - Weather to put annotation in javadocs
* @Retention - When the annotation is needed
* @Target? - Places the annotation can go
* @Inherited - Weather the subclass gets the annotation.
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default  "Nishit";
    String date();
    int revision() default  1;
    String comments();
}
