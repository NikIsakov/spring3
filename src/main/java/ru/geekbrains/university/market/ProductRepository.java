package ru.geekbrains.university.market;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> { //, MongoRepository<Product,Long>



    List<Product> findAllByCostGreaterThanEqualAndCostLessThan(int min, int max);

    List<Product> findAllByCostIsLessThan(int max);

    List<Product> findAllByCostGreaterThan(int min);

    List<Product> findAllByTitleContains(String word);

//    @Query("{ 'titre' : { '$regex' : ?0 , $options: 'i'}}")
//    List<Product> findAllByTitleRegex(String word);

}
