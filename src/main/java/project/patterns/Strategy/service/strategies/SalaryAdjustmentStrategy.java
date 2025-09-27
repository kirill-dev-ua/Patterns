package project.patterns.Strategy.service.strategies;

import project.patterns.Strategy.entity.Employee;
import java.math.BigDecimal;
import java.util.Optional;

public interface SalaryAdjustmentStrategy{
    BigDecimal adjustSalary(Employee employee);
}
