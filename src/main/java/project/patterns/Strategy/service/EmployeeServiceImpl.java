package project.patterns.Strategy.service;

import org.springframework.stereotype.Service;
import project.patterns.Strategy.entity.SalaryAdjustmentRequest;
import project.patterns.Strategy.repo.EmployeeService;

import java.math.BigDecimal;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public BigDecimal adjustSalary(BigDecimal salary, SalaryAdjustmentRequest employee) {
        return null;
    }
}
