package ca.johnjamieson.weddingjava.controller;

import ca.johnjamieson.weddingjava.model.Person;
import ca.johnjamieson.weddingjava.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    // Display the RSVP form
    @GetMapping("/rsvp")
    public String showRsvpForm(Model model) {
        model.addAttribute("rsvp", new Person());
        return "rsvp"; // corresponds to src/main/resources/templates/rsvp.html
    }

    // Process the RSVP form submission
    @PostMapping("/rsvp")
    public String submitRsvp(@ModelAttribute Person person, Model model) {
        personRepository.save(person);
        model.addAttribute("thanks", "Thank you for your RSVP!");
        return "rsvp"; // You can also redirect or show a confirmation page
    }
}
