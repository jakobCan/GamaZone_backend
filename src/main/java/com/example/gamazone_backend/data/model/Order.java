package com.example.gamazone_backend.data.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "spaceOrder")
public class Order {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id")
    private @NotBlank Integer userId;    // TODO: 15.10.2021 muss User dann auch Order verwalten? Damit er zB. seine alten Bestellungen sehen kann

    private String orderStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
// TODO: 15.10.2021 implement this please (for bonus points)
    /*
    o Eine Bestellung wird gespeichert, wenn ein User den eigenen Warenkorb bestellt
    o Teil der Bestellung ist der User, die Produkte und der Bestellstatus
    */
}
