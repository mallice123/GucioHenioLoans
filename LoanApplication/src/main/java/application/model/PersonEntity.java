package application.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name = "person")
@Entity
@Getter
@Setter
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @OneToMany()
    @JoinColumn(name = "document_id")
    private List<IdentificationDocumentEntity> document;

    @OneToMany()
    @JoinColumn(name = "occupation_id")
    private List<OccupationEntity> occupation;

    @OneToMany()
    @JoinColumn(name = "address_id")
    private List<AddressEntity> address;

}
