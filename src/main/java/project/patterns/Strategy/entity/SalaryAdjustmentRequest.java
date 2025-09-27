package project.patterns.Strategy.entity;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class SalaryAdjustmentRequest {

    @NotBlank(message = "Strategy type is required")
    private String strategyType;

    @NotNull(message = "Amount is required")
    @Positive(message = "Amount must be positive")
    private BigDecimal amount;

    private String jobTitle;
}
