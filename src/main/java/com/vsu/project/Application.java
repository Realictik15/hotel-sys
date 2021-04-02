package com.vsu.project;

import com.vsu.project.configs.SpringConfig;
import com.vsu.project.models.Bid;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String [] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Bid bid = context.getBean("bid", Bid.class);
        System.out.println(bid.getInformation());
    }
}
