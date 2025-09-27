package project.patterns.Strategy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.patterns.Strategy.service.SalaryAdjustmentService;
import java.math.BigDecimal;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final SalaryAdjustmentService service;

    @PutMapping("/{id}")
    public ResponseEntity<BigDecimal> adjust(@PathVariable Long id,
                                             @RequestParam String strategy) {
        return ResponseEntity.ok(service.adjust(id, strategy));
    }
}
