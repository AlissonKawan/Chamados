package br.com.alisson.model;

import java.time.LocalDateTime;

public class Chamado {
    private int id;
    private String titulo;
    private String descricao;
    private Status status = Status.ABERTO;
    private Prioridade prioridade;
    private String categoria;
    private String nomeSolicitante;
    private String emailSolicitante;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    private Tecnico tecnico;

    public enum Status {
        ABERTO,
        EM_ANALISE,
        EM_ANDAMENTO,
        PARADO,
        RESOLVIDO,
        FECHADO
    }

    public enum Prioridade {
        BAIXA,
        MEDIA,
        ALTA,
        EXTREMA
    }

    public Chamado(String titulo, String descricao, String categoria, String nomeSolicitante, String emailSolicitante,Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.nomeSolicitante = nomeSolicitante;
        this.emailSolicitante = emailSolicitante;
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public String getEmailSolicitante() {
        return emailSolicitante;
    }

    public void setEmailSolicitante(String emailSolicitante) {
        this.emailSolicitante = emailSolicitante;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
