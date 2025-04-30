package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long SecurityId;
    @Column
    private long PortfolioId;
    @Column
    private String name;
    @Column
    private String category;
    @Column
    private String purchasePrice;
    @Column
    private String purchaseDate;
    @Column
    private String quantity;
    protected Security() {}
    public Security(long SecurityId, long PortfolioId, String name, String category, String purchasePrice, String purchaseDate, String quantity) {
        this.SecurityId = SecurityId;
        this.PortfolioId = PortfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;

    }}
