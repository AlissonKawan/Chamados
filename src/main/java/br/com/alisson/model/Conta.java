package br.com.alisson.model;

public class Conta {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Tipo tipo;
    public enum Tipo{
        ADMIN,
        TECNICO,
        SOLICITANTE
    }

    public Conta(Tipo tipo, String senha, String email, String nome) {
        this.tipo = tipo;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
