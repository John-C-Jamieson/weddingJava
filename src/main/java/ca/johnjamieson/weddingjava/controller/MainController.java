package ca.johnjamieson.weddingjava.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController extends BaseController
{

    @Value("bg-light")
    private String theme;

    @GetMapping("/")
    public String showSaveTheDatePage(Model model)
    {
        model.addAttribute("theme", theme);
        return "index"; // returns the view name (index.html)
    }

    @GetMapping("/location")
    public String showLocation(Model model)
    {
        return "location";// returns the view name (location.html)
    }

    @GetMapping("/dress")
    public String showDress(Model model)
    {
        return "dress";// returns the view name (dress.html)
    }

    @GetMapping("/menu")
    public String showMenu(Model model)
    {
        return "menu";// returns the view name (menu.html)
    }

    @GetMapping("/registry")
    public String showRegistry(Model model)
    {
        return "registry";// returns the view name (registry.html)
    }

    @GetMapping("/schedule")
    public String showSchedule(Model model)
    {
        return "schedule";// returns the view name (schedule.html)
    }
}
