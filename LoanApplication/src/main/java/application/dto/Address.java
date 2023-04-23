package application.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class Address {
    private Long id;
    private String email;
    private String postalCode;
    private String town;
    private String streetName;
}
