package nasch.prestabanco.loans_service.repositories;

import nasch.prestabanco.loans_service.entities.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Long> {
    public LoanEntity findByRut(String rut);
    public LoanEntity findByState(String state);
}

