package ru.geekbrains.university.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.university.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
