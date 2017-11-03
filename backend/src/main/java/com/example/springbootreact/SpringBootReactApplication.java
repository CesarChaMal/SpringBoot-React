package com.example.springbootreact;

import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Cesar Chavez.
 */
@SpringBootApplication(exclude = SessionAutoConfiguration.class)
public class SpringBootReactApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootReactApplication.class, args);
  }
}
