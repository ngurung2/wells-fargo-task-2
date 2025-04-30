package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @Column
    private long clientId;
    @Column
    private String creationDate;

    protected Portfolio() {
    }

    public Portfolio(long portfolioId, long clientId, String creationDate) {
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }
}
