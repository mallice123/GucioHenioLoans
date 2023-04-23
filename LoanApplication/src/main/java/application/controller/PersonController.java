package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import application.dto.PersonDto;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {

    @GetMapping
    public List<PersonDto> getPersons() {
    return List.of(
            PersonDto.builder()
                    .firstName("Jakub")
                    .lastName("Szarubka")
                    .birthDate(LocalDate.of(1990,11,05))
                    .phoneNumber("793-767-343")
                    .build());
    }

}


