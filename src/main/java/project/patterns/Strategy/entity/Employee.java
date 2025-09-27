package project.patterns.Strategy.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    private BigDecimal salary;

    private String phone;

    @Column(name = "office_location")
    private String officeLocation;
}
