package application.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Getter
@Setter
public class Occupation {
    private Long id;
    private String employeeName;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal grossSalary;
    private BigDecimal netSalary;
}
