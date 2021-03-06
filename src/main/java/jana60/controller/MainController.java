package jana60.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

  @GetMapping("/saluta")
  public String saluta() {
    return "home";
  }

  @GetMapping
  public String dinamico(Model model) {
    String nameInput = "Costanza";
    model.addAttribute("name", nameInput);
    return "dinamico";
  }


}
