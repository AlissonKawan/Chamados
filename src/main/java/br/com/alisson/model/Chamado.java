package br.com.alisson.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Chamado extends PanacheEntity {
    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ABERTO;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private String categoria;

    @ManyToOne
    private Solicitante solicitante;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    @ManyToOne
    private Tecnico tecnico;

    public Chamado() {
    }

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

    public Chamado(String titulo, String descricao, String categoria, Solicitante solicitante,Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.solicitante = solicitante;
        this.prioridade = prioridade;
        this.dataCriacao = LocalDateTime.now();
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

    public Tecnico getTecnico() {
        return tecnico;
    }

    public Solicitante getSolicitante() {
        return solicitante;
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

    public void assumir(Tecnico tecnico) {
        this.tecnico = tecnico;
        this.dataAtualizacao = LocalDateTime.now();
        this.status = Status.EM_ANDAMENTO;
    }
}
