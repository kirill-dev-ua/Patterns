package project.patterns.Strategy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.patterns.Strategy.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
