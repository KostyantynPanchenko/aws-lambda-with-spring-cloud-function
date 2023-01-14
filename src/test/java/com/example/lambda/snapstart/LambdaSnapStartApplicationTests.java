package com.example.lambda.snapstart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class LambdaSnapStartApplicationTests {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  void contextLoads() {
    ResponseEntity<String> response = restTemplate.exchange("/uppercase/lambda", HttpMethod.GET,
        new HttpEntity<>("lambda"), String.class);
    assertThat(response.getBody()).isEqualTo("LAMBDA");
  }

}
