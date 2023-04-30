package application.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
public class IdentificationDocumentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "document_id", nullable = false)
    private Long documentId;

    @Column(name = "personal_id", nullable = false)
    private Long personalID;

    @Column(name = "creation_date", nullable = false)
    private LocalDate dateOfCreation;

    @Column(name = "expiry_date", nullable = false)
    private LocalDate expiryDateOfDocument;

}
