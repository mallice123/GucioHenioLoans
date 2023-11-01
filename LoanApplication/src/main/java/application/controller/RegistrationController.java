package application.controller;


import application.modelDto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @PostMapping("/submit_registration")
    public String collectRegistrationForm(Person personForm) {
        System.out.println("First Name: " + personForm.getFirstName());
        System.out.println("Last Name: " + personForm.getLastName());
        return "success";
    }
}
