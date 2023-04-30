package application.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "postCode", nullable = false, length = 20)
    private String postalCode;

    @Column(name = "town", nullable = false, length = 50)
    private String town;

    @Column(name = "streetName", nullable = false)
    private String streetName;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;
}
