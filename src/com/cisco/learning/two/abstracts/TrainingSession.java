package com.cisco.learning.two.abstracts;

public @interface TrainingSession {

    String topic() default "";

    String difficulty() default "easy :)";
}
