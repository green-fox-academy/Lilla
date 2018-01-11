package greenfoxacademy.com.demo.controller.show;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextWEBController {

  @RequestMapping(value = "/text")
  public String show(Model model) {
    model.addAttribute("formatted", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }

}
