package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue ()
    private long clientId;
    @Column
    private long advisorId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String email;
    protected Client() {}
    public Client(long advisorId, String firstName, String lastName, String address, String phone, String email) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
@Entity
class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @Column
    private long clientId;
    @Column
    private String creationDate;
    protected Portfolio() {}
    public Portfolio(long portfolioId, long clientId, String creationDate) {
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }
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

     }


                
            }

    }


    }






}
