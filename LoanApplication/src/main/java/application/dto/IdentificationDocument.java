package application.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class IdentificationDocument {
    private Long id;
    private Long documentId;
    private Long personalID;
    private LocalDate dateOfcreation;
    private LocalDate expiryDateOfDocument;

}
