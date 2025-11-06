package ma.emsi.elyamami.billingservices.repositories;

import ma.emsi.elyamami.billingservices.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
