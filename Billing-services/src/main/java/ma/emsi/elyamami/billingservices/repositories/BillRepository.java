package ma.emsi.elyamami.billingservices.repositories;


import ma.emsi.elyamami.billingservices.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository  extends JpaRepository<Bill, Long> {
}