package application.repository;

import application.model.PersonEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
           PersonEntity Jakub = PersonEntity.builder()
                    .firstName("Jakub")
                    .lastName("Woźniak")
                    .birthDate(LocalDate.of(1990,11,05))
                    .phoneNumber("793-767-343")
                    .build();
            PersonEntity Kornelia = PersonEntity.builder()
                    .firstName("Kornelia")
                    .lastName("Woźniak")
                    .birthDate(LocalDate.of(1989,12,21))
                    .phoneNumber("793-767-343")
                    .build();
            personRepository.saveAll(List.of(Jakub,Kornelia));
        };
    }
}
