package application.controller;

import application.service.RegistrationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/registration")
public class RegistrationController {
    private RegistrationService registrationService;

/*
    public RegistrationController(RegistrationService registrationService){
        this.registrationService = registrationService;
    }
*/

}

