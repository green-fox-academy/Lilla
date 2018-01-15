package greenfoxacademy.com.demo.controller.show;

import greenfoxacademy.com.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Controller
public class MultipleAccountController {

  ArrayList <BankAccount> animals = new ArrayList<>(Arrays.asList(
          new BankAccount("Nara",2000, "lion"),
          new BankAccount("Mufasa",27000, "lion", true),
          new BankAccount("Simba",1900, "lion", true),
          new BankAccount(true,"Scar", 17000, "lion"),
          new BankAccount("Rafiki", 8000, "monkey"),
          new BankAccount("Zazu", 3200, "toucan"),
          new BankAccount(true, "Banzai", 3200, "hyena"),
          new BankAccount("Timon", 4500, "suricata"),
          new BankAccount("Pumba", 7800, "warthog")));

  @RequestMapping("/list")
  public String listAnimals(Model model) {



    model.addAttribute("animals", animals);
    return "multipleAccount";
  }

  @RequestMapping(value = "/list", params = {"raiseBalance"}) // i need params inside form: nam="
  public String raiseBalance(final HttpServletRequest request) {
    final Integer accountIndex = Integer.valueOf(request.getParameter("raiseBalance"));

    BankAccount account = animals.get(accountIndex);

    if(account.isKing() == true) {
      account.setBalance(account.getBalance() + 100);
    } else {
      account.setBalance(account.getBalance() + 10);
    }
    return "redirect:list";
  }
}
