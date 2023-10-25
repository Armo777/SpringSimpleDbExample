package org.top.springsimpledbexample;

import jakarta.persistence.*;

// Класс Product - описывает объект товара
// соответсвует таблицы product_t из БД
// хранить информацию об объекте "Товар", не реализует бизнес-логику
// является dataclass-ом
@Entity
@Table(name = "product_t")
public class Product {
    // поля - соответствуют столбцам (атрибутам) таблице в БД
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title_f", nullable = false)
    private String title;

    @Column(name="price_f", nullable = false)
    private Double price;

    @Column(name="quantity_f", nullable = false)
    private Integer quantity;

    @Column(name="description_f")
    private String description;

    // constructors

    // 1. конструктор по умолчанию
    public Product() {
        id = 0;
        title = "";
        price = 0.0;
        quantity = 0;
        description = null;
    }

    // getters & setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // представление объекта в виде строки
    @Override
    public String toString() {
        // Product(id=1,title="test",price=1000,quantity=100,description=null)
        // toString() -> "1 - test - 1000 - 100 - null"
        return id + " - " + title + " - " + price + " - " + quantity + " - " + description;
    }
}
