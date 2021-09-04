package com.sales.admin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String img;

    private double price;

    private double discount;

    private double includeVAT;

    private double amount;

    private double sold;

    @ManyToMany
    private Collection<Category> category;
}
