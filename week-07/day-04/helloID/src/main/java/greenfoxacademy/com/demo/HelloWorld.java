package greenfoxacademy.com.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

  private String message = "hello";

  public String getMessage() {
    return message;
  }

  public HelloWorld() {
  }
}
