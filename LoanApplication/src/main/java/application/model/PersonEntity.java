package application.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "person", schema = "applicationschema")
@Getter
@Setter
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", sequenceName = "person_id_seq", allocationSize = 1, schema = "applicationschema")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany()
    @JoinColumn(name = "identification_document_id")
    private List<IdentificationDocumentEntity> document;

    @OneToMany()
    @JoinColumn(name = "occupation_id")
    private List<OccupationEntity> occupation;

    @OneToMany()
    @JoinColumn(name = "address_id")
    private List<AddressEntity> address;

}
