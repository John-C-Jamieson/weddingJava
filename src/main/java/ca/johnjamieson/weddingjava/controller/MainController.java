package ca.johnjamieson.weddingjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController extends BaseController {
    @GetMapping("/")
    public String showSaveTheDatePage(Model model) {
        return "index"; // returns the view name (index.html)
    }

    @GetMapping("/location")
    public String showLocation(Model model) {
        return "location";// returns the view name (location.html)
    }
}
