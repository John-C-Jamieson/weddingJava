package ca.johnjamieson.weddingjava.controllers;

import ca.johnjamieson.weddingjava.models.People;
import ca.johnjamieson.weddingjava.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

    // Display the RSVP form
    @GetMapping("/rsvp")
    public String showRsvpForm(Model model) {
        model.addAttribute("rsvp", new People());
        return "rsvp"; // corresponds to src/main/resources/templates/rsvp.html
    }

    // Process the RSVP form submission
    @PostMapping("/rsvp")
    public String submitRsvp(@ModelAttribute People people, Model model) {
        peopleRepository.save(people);
        model.addAttribute("message", "Thank you for your RSVP!");
        return "rsvp"; // You can also redirect or show a confirmation page
    }
}
