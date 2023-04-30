package application.model;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table
@En
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phoneNumber;
    private IdentificationDocument document;
    private Occupation occupation;
    private Address address;

}
