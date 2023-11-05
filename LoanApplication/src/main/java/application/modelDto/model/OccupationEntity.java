package application.modelDto.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "occupation",schema = "applicationschema")
@Getter
@Setter
public class OccupationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "occupation_seq")
    @SequenceGenerator(name = "occupation_seq", sequenceName = "occupation_id_seq", allocationSize = 1, schema = "applicationschema")
    private Long id;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "start_date", nullable = false, length = 20)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false, length = 50)
    private LocalDate endDate;

    @Column(name = "gross_salary", nullable = false)
    private BigDecimal grossSalary;

    @Column(name = "net_salary", nullable = false)
    private BigDecimal netSalary;

}
