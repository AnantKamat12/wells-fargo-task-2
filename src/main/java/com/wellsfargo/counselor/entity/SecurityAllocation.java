package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class SecurityAllocation {

    @Id
    @GeneratedValue()
    private long allocationId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(nullable = false)
    private int quantity;

    protected SecurityAllocation() {}

    public SecurityAllocation(Client client, Security security, int quantity) {
        this.client = client;
        this.security = security;
        this.quantity = quantity;
    }

    public long getAllocationId() {
        return allocationId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
