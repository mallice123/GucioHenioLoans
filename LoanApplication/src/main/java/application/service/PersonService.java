package application.service;

import application.model.Person;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PersonService {


    public List<Person> getPersons(){
        return List.of(
                Person.builder()
                        .firstName("Jakub")
                        .lastName("Szarubka")
                        .birthDate(LocalDate.of(1990,11,05))
                        .phoneNumber("793-767-343")
                        .build());
    }

}
