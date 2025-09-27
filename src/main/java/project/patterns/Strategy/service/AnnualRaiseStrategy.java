package project.patterns.Strategy.service;

import project.patterns.Strategy.entity.Employee;
import project.patterns.Strategy.repo.SalaryAdjustmentStrategy;

import java.math.BigDecimal;

public class AnnualRaiseStrategy implements SalaryAdjustmentStrategy {
    @Override
    public BigDecimal adjustSalary(Employee employee) {
        return employee.getSalary().multiply(BigDecimal.valueOf(2));
    }
}
