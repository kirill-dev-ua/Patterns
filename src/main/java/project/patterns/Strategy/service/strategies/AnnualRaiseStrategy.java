package project.patterns.Strategy.service.strategies;

import org.springframework.stereotype.Component;
import project.patterns.Strategy.entity.Employee;

import java.math.BigDecimal;

@Component("annualRaise")
public class AnnualRaiseStrategy implements SalaryAdjustmentStrategy {

    @Override
    public BigDecimal adjustSalary(Employee employee) {
        return employee.getSalary().multiply(BigDecimal.valueOf(2));
    }
}
