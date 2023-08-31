package com.renan.Santander_dev.Entity;

import jakarta.persistence.*;

@Entity(name = "tb_bankloan")
public class BankLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cpf;

    public BankLoan(){}

    public BankLoan(Long cpf, boolean status) {
        this.cpf = cpf;
        this.status = status;
    }

    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return cpf;
    }

    public void setIdUser(Long idUser) {
        this.cpf = idUser;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
