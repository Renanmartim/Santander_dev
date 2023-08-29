package com.renan.Santander_dev.Entity;

import jakarta.persistence.*;

@Entity(name = "tb_bankloan")
public class BankLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public BankLoan(){}

    public BankLoan(User user, boolean status) {
        this.user = user;
        this.status = status;
    }

    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
