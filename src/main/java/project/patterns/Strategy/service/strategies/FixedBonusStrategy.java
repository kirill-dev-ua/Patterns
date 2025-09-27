package project.patterns.Strategy.service.strategies;

import org.springframework.stereotype.Component;
import project.patterns.Strategy.entity.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component("fixedBonus")
public class FixedBonusStrategy implements SalaryAdjustmentStrategy {

    @Override
    public BigDecimal adjustSalary(Employee employee) {
        return employee.getSalary().add(BigDecimal.valueOf(500))
                .setScale(2, RoundingMode.HALF_UP);
    }
}
