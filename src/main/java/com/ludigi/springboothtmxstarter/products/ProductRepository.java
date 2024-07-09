package com.ludigi.springboothtmxstarter.products;

import net.datafaker.Faker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
class ProductRepository {
    private final Faker faker = new Faker();

    List<Product> findAll(int size) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            products.add(
                    new Product(faker.number().randomNumber(),
                            faker.food().ingredient(),
                            faker.lorem().sentence(5)
                    )
            );
        }
        return products;
    }
}
