package com.codeWithAshith.SpringBootReactiveMongoCrud.repository;

import com.codeWithAshith.SpringBootReactiveMongoCrud.dto.ProductDto;
import com.codeWithAshith.SpringBootReactiveMongoCrud.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
    Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);
}