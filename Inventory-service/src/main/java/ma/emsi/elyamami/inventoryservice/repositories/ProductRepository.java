package ma.emsi.elyamami.inventoryservice.repositories;

import ma.emsi.elyamami.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
