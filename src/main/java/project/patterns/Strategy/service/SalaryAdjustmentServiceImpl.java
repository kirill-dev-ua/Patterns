package project.patterns.Strategy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.patterns.Strategy.entity.Employee;
import project.patterns.Strategy.repo.EmployeeRepository;
import project.patterns.Strategy.service.strategies.SalaryAdjustmentStrategy;
import java.math.BigDecimal;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SalaryAdjustmentServiceImpl implements SalaryAdjustmentService{

    private final Map<String, SalaryAdjustmentStrategy> strategies;
    private final EmployeeRepository employeeRepository;

    @Override
    public BigDecimal adjust(Long id, String strategyKey) {
       Employee employee = employeeRepository.findById(id).orElseThrow();
        var strategy = strategies.get(strategyKey);
        employee.setSalary(strategy.adjustSalary(employee));
        employeeRepository.save(employee);
        return employee.getSalary();
    }
}
