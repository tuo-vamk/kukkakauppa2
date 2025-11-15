package fi.vamk.tuo.kukkakauppa2.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.vamk.tuo.kukkakauppa2.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}