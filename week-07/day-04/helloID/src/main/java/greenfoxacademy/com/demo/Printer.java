package greenfoxacademy.com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer implements CommandLineRunner {
  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }

  @Autowired
  HelloWorld hello;

  @Autowired
  Printer printer;


  @Override
  public void run(String... args) throws Exception {
    printer.log(hello.getMessage());
  }
}
