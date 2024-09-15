package abk.sn.inventotyservice.repository;

import abk.sn.inventotyservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
