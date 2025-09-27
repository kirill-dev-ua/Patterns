package project.patterns.Strategy.service;

import org.springframework.stereotype.Service;
import project.patterns.Strategy.repo.PromotionEmployeeRepository;

import java.math.BigDecimal;

@Service
public class PromotionEmployeeService {
    private final PromotionEmployeeRepository promotionEmployeeRepository;


    public PromotionEmployeeService(PromotionEmployeeRepository promotionEmployeeRepository) {
        this.promotionEmployeeRepository = promotionEmployeeRepository;
    }

    public void setUpdateEmployee(Long id, BigDecimal newSalary){

    }

    public void setPromotionEmployee(Long id, BigDecimal newSalary, String newJobTitle){

    }
}
