package application.config;

import application.dto.Person;
import application.model.PersonEntity;
import application.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class JpaStubData {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
            Person jakub = Person.builder()
                    .firstName("Jakub")
                    .lastName("Woźniak")
                    .birthDate(LocalDate.of(1990,11,05))
                    .phoneNumber("793-767-343")
                    .build();
            Person kornelia = Person.builder()
                    .firstName("Kornelia")
                    .lastName("Woźniak")
                    .birthDate(LocalDate.of(1989,12,21))
                    .phoneNumber("793-767-343")
                    .build();
            ModelMapper mapper = new ModelMapper();
            PersonEntity jakubEntity = mapper.map(jakub, PersonEntity.class);
            PersonEntity korneliaEntity = mapper.map(kornelia, PersonEntity.class);
            personRepository.saveAll(List.of(jakubEntity,korneliaEntity));
        };
    }
}
