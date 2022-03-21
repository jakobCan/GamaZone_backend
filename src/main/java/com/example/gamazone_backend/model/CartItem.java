package com.example.gamazone_backend.model;

import javax.persistence.*;


@Entity
@Table(name="cartitems")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private long id;

    @ManyToOne
    private SpaceObject spaceObject;

    @Column(name="quantity", nullable = false)
    private int quantity;

    @ManyToOne
    private Cart cart;

    public CartItem() {}

    public CartItem(SpaceObject spaceObject, int quantity) {
        this.spaceObject = spaceObject;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SpaceObject getSpaceObject() {
        return spaceObject;
    }

    public void setSpaceObject(SpaceObject spaceObject) {
        this.spaceObject = spaceObject;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem [id=" + id + ", spaceObject=" + spaceObject + ", quantity=" + quantity + "]";
    }

}


/*
@Entity
@Table
public class Cart {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<SpaceObject> spaceObjects;
    // TODO: 15.10.2021 wie löst man das Problem? OneToMany oder embeddable?
    private int totalSum;
    private int numberOfItems;  // TODO: 15.10.2021 brauchen wir eigentlich nicht, weil spaceObjects.length?

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cart() {
    }

    public Cart(List<SpaceObject> spaceObjects, int totalSum, int numberOfItems) {
        this.spaceObjects = spaceObjects;
        this.totalSum = totalSum;
        this.numberOfItems = numberOfItems;
    }

    public List<SpaceObject> getPlanet() {
        return spaceObjects;
    }

    public void setPlanet(List<SpaceObject> planet) {
        this.spaceObjects = planet;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}
*/
