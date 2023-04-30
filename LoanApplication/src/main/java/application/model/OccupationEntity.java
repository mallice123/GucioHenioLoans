package application.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "occupation")
@Getter
@Setter
public class OccupationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "employeeName", nullable = false)
    private String employeeName;

    @Column(name = "startDate", nullable = false, length = 20)
    private LocalDate startDate;

    @Column(name = "endDate", nullable = false, length = 50)
    private LocalDate endDate;

    @Column(name = "grossSalary", nullable = false)
    private BigDecimal grossSalary;

    @Column(name = "netSalary", nullable = false)
    private BigDecimal netSalary;

}
