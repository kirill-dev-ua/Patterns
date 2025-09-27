package project.patterns.Strategy.repo;

import project.patterns.Strategy.entity.Employee;
import java.math.BigDecimal;

public interface SalaryAdjustmentStrategy {
    BigDecimal adjustSalary(Employee employee);
}
