package project.patterns.Strategy.service.strategies;

import org.springframework.stereotype.Component;
import project.patterns.Strategy.entity.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component("percentageRaise")
public class PercentageRaiseStrategy implements SalaryAdjustmentStrategy {

    @Override
    public BigDecimal adjustSalary(Employee employee) {
        return employee.getSalary().multiply(BigDecimal.valueOf(1.1))
                .setScale(2, RoundingMode.HALF_UP);
    }
}
