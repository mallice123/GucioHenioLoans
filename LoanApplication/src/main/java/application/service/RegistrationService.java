package application.service;


import application.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private PersonRepository personRepository;
    @Autowired
    public RegistrationService(PersonRepository registrationService) {
        this.personRepository = registrationService;
    }


}
