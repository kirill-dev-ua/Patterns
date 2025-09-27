package project.patterns.Strategy.service.strategies;

import org.springframework.stereotype.Component;
import project.patterns.Strategy.entity.Employee;

import java.math.BigDecimal;

@Component("newYearBonus")
public class NewYearBonusStrategy implements SalaryAdjustmentStrategy {
    @Override
    public BigDecimal adjustSalary(Employee employee) {
        return employee.getSalary().add(BigDecimal.valueOf(300));
    }
}
