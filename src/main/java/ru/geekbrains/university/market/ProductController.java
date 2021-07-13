package ru.geekbrains.university.market;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id).get();
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/delete{id}")
    public void delete(@PathVariable Long id){
       productRepository.deleteById(id);
    }

    @GetMapping("/minmax")
    public List<Product> getAllProducts(@RequestParam Integer min, @RequestParam Integer max) {
        return productRepository.findAllByCostGreaterThanEqualAndCostLessThan(min, max);
    }

    @GetMapping("/cheaper")
    public List<Product> getAllProductsMax(@RequestParam Integer max) {
        return productRepository.findAllByCostIsLessThan(max);
    }

    @GetMapping("/greater")
    public List<Product> getAllProductsMin(@RequestParam Integer min) {
        return productRepository.findAllByCostGreaterThan(min);
    }

    /*
    Пока не решена проблема поиска без учета регистра
     */
    @GetMapping("/title")
    public List<Product> getAllProductsTitle(@RequestParam String word) {
        return productRepository.findAllByTitleContains(word);
    }

//    @GetMapping("/title2")
//    public List<Product> getAllProductsTitle2(@RequestParam String word) {
//        return productRepository.findAllByTitleRegex(word);
//    }
}

