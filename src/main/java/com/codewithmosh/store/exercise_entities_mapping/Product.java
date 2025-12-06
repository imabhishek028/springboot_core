package com.codewithmosh.store.exercise_entities_mapping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
