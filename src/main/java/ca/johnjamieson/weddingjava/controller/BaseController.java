package ca.johnjamieson.weddingjava.controller;

import ca.johnjamieson.weddingjava.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

@Controller
public abstract class BaseController {

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("rsvp", new Person());
    }
}
