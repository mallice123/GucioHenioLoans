package application.config;

import application.modelDto.Person;
import application.model.PersonEntity;
import application.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "generate.stub")
public class JpaStubData {
    private boolean data = true;

    public void setData(boolean data) {
        this.data = data;
    }
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
            if(data) {
                Person jakub = Person.builder()
                        .firstName("Jakub")
                        .lastName("Woźniak")
                        .birthDate(LocalDate.of(1990, 11, 5))
                        .phoneNumber("793-767-343")
                        .build();
                Person kornelia = Person.builder()
                        .firstName("Kornelia")
                        .lastName("Woźniak")
                        .birthDate(LocalDate.of(1989, 12, 21))
                        .phoneNumber("793-767-343")
                        .build();
                ModelMapper mapper = new ModelMapper();
                PersonEntity jakubEntity = mapper.map(jakub, PersonEntity.class);
                PersonEntity korneliaEntity = mapper.map(kornelia, PersonEntity.class);
                personRepository.saveAll(List.of(jakubEntity, korneliaEntity));
            }
        };
    }
}
