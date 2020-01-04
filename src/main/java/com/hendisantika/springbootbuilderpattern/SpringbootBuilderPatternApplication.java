package com.hendisantika.springbootbuilderpattern;

import com.hendisantika.springbootbuilderpattern.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootBuilderPatternApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootBuilderPatternApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBuilderPatternApplication.class, args);
        // demo of builder pattern
        Product product = new Product.Builder()
                .name("Product 1")
                .barCode("8178889900")
                .cost(21.99)
                .expirationDate(LocalDate.now())
                .build();

        LOGGER.info("Built product: {}", product);
    }

}
