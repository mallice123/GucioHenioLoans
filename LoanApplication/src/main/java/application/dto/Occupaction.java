package application.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Getter
@Setter
public class Occupaction {
    private Long id;
    private String employeeName;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal grossSalary;
    private BigDecimal netSalary;
}
