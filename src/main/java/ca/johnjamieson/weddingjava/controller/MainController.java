package ca.johnjamieson.weddingjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController extends BaseController {
    @GetMapping("/")
    public String showSaveTheDatePage(Model model) {
        // Add wedding details to the model.
        // model.addAttribute("coupleNames", "John & Jane");
        // model.addAttribute("weddingDate", "August 15, 2025");
        // model.addAttribute("venue", "Beautiful Garden Venue");
        return "index"; // returns the view name (index.html)
    }
}
