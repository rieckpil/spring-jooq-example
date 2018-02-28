package de.rieckpil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

  @GetMapping
  public String sayHello() {
    return "Hello World!";
  }
}
