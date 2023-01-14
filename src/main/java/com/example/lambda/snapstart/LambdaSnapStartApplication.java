package com.example.lambda.snapstart;

import java.util.Locale;
import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LambdaSnapStartApplication {

  public static void main(String[] args) {
    SpringApplication.run(LambdaSnapStartApplication.class, args);
  }

  @Bean
  public Function<String, String> uppercase() {
    return input -> input.toUpperCase(Locale.US);
  }
}
