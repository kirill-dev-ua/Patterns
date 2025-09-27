package project.patterns.Strategy.repo;

import project.patterns.Strategy.entity.SalaryAdjustmentRequest;

import java.math.BigDecimal;

public interface EmployeeService {
    BigDecimal adjustSalary(BigDecimal salary, SalaryAdjustmentRequest employee);
}
