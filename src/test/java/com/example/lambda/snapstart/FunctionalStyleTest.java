package com.example.lambda.snapstart;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.net.URISyntaxException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.function.context.test.FunctionalSpringBootTest;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

@FunctionalSpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FunctionalStyleTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  void testFunction() throws URISyntaxException {
    ResponseEntity<String> response = restTemplate.exchange(
        RequestEntity.get(new URI("/uppercase/lambda")).build(), String.class);
    assertThat(response.getBody()).isEqualTo("LAMBDA");
  }

}
