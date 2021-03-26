package com.xdxiaoran;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class VoteSystemApplication {
    public static ConfigurableApplicationContext context ;
    public static void main(String[] args) {
        SpringApplication.run(VoteSystemApplication.class, args);
    }

}
