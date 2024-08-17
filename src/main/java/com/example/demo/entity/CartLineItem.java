package com.example.demo.entity;

import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class CartLineItem {
//    @Id
//    private int cartId;
//
//    @Id
//    private int variantProductId;

    private int quantity;
    private float totalPrice;
    private Timestamp addedDate;
    private boolean isDeleted;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "cartId")
    private Cart cart;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "variantProductId")
    private VariantProduct variantProduct;
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;
}

