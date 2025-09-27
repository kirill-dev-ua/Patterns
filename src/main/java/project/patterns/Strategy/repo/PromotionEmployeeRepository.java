package project.patterns.Strategy.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.patterns.Strategy.entity.Employee;

@Repository
public interface PromotionEmployeeRepository extends JpaRepository<Employee, Long> {

}
