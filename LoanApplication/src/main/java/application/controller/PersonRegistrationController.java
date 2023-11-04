package application.controller;


import application.modelDto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonRegistrationController {

    @PostMapping("/submit_registration")
    public ResponseEntity<String> collectPersonForm(@ModelAttribute("personForm") Person personForm) {
        if (!isAddressDataValid(personForm)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Provided data is invalid");
        }
        System.out.println("First Name: " + personForm.getFirstName());
        System.out.println("Last Name: " + personForm.getLastName());
        System.out.println("Birth Date: " + personForm.getBirthDate());
        System.out.println("Phone Number: " + personForm.getPhoneNumber());

        return ResponseEntity.status(HttpStatus.OK).body("Registration data saved successfully");
    }

    private boolean isAddressDataValid(Person personForm) {
        return true;
    }
}
