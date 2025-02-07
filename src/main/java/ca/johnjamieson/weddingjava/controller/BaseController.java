package ca.johnjamieson.weddingjava.controller;

import ca.johnjamieson.weddingjava.model.Person;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;

// Abstract base class so that all controllers have the "rsvp" from submission
@Controller
public abstract class BaseController
{
    @ModelAttribute
    public void addAttributes(Model model, HttpServletRequest request)
    {
        model.addAttribute("person", new Person());
        model.addAttribute("originatingPage", request.getRequestURI());
    }
}
