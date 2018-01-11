package greenfoxacademy.com.demo.controller.show;

import greenfoxacademy.com.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowWEBController {
  BankAccount lion = new BankAccount("Simba", 2000, "lion");

  @RequestMapping(value = "/show")
  public String show(Model model) {
    model.addAttribute("account", lion.toString());
    return "show";
  }
}
