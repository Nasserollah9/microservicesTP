package ma.emsi.elyamami.customerservice.repositories;

import ma.emsi.elyamami.customerservice.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource // demander a spring de demarrer un web service auto
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
