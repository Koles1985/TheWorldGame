package com.koles.world;

import com.koles.spring_anotation.MainAnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainAnotation.class);

        World world = context.getBean("worldBean", World.class);
    }
}
