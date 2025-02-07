package ca.johnjamieson.weddingjava.controller;

import ca.johnjamieson.weddingjava.model.Person;
import ca.johnjamieson.weddingjava.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController extends BaseController
{
    @Autowired
    private PersonRepository personRepository;

    // Process the RSVP form submission
    @PostMapping("/person")
    public String submitRsvp(@RequestParam String originatingPage, @ModelAttribute Person person, Model model)
    {
        personRepository.save(person);
        return "redirect:" + originatingPage;
    }
}
