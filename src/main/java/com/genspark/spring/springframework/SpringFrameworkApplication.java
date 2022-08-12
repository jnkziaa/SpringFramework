package com.genspark.spring.springframework;

import com.genspark.spring.springframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
        GameRunner runner = context.getBean(GameRunner.class);

        runner.run();

    }

}
