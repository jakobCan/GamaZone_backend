package com.example.gamazone_backend.model;

import javax.persistence.*;

@Entity
@Table(name="cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Cart() {
    }

    public Cart(Long id) {
        this.id = id;
    }
}
