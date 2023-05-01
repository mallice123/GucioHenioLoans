package application.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "identification_document", schema = "applicationschema")
@Getter
@Setter
public class IdentificationDocumentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "identification_document_seq")
    @SequenceGenerator(name = "identification_document_seq", sequenceName = "identification_document_id_seq", allocationSize = 1, schema = "applicationschema")
    private Long id;

    @Column(name = "document_id", nullable = false)
    private Long documentId;

    @Column(name = "personal_id", nullable = false)
    private Long personalID;

    @Column(name = "date_of_creation", nullable = false)
    private LocalDate dateOfCreation;

    @Column(name = "expiry_date_of_document", nullable = false)
    private LocalDate expiryDateOfDocument;

}
