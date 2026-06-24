package br.com.alisson.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
public class Solicitante extends PanacheEntity {

    @OneToOne
    private Conta conta;

    public Solicitante(Conta conta) {
        this.conta = conta;
    }

    public Solicitante() {

    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
