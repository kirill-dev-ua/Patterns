package project.patterns.Strategy.service;

import java.math.BigDecimal;

public interface SalaryAdjustmentService {
    BigDecimal adjust(Long id, String strategyKey);
}
