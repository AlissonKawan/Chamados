package br.com.alisson.model;

public class Solicitante {
    private int id;
    private Conta conta;

    public Solicitante(Conta conta) {
        this.conta = conta;
    }

    public int getId() {
        return id;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
