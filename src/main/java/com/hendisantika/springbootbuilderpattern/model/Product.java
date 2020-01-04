package com.hendisantika.springbootbuilderpattern.model;

import org.springframework.context.annotation.Description;

import java.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-builder-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/01/20
 * Time: 06.07
 */
@Description(value = "Demo definition of product class and its builder.")
public class Product {

    private final String name;
    private final Double cost;
    private final String barCode;
    private final LocalDate expirationDate;

    private Product(Builder builder) {
        this.name = builder.name;
        this.cost = builder.cost;
        this.barCode = builder.barCode;
        this.expirationDate = builder.expirationDate;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public String getBarCode() {
        return barCode;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", barCode='" + barCode + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }

    /**
     * Static builder class - responsible for building objects.
     */
    public static final class Builder {

        private String name;
        private Double cost;
        private String barCode;
        private LocalDate expirationDate;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder cost(Double cost) {
            this.cost = cost;
            return this;
        }

        public Builder barCode(String barCode) {
            this.barCode = barCode;
            return this;
        }

        public Builder expirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}