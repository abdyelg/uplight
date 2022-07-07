package com.uplight.uplightapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class UplightApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(UplightApplication.class, args);
    }
}
