package br.com.alisson.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Tecnico extends PanacheEntity {

    @OneToOne
    private Conta conta;

    private especialidade especialidade;

    public Tecnico() {
    }

    public enum especialidade {
        ANALISTA,
        DESENVOLVEDOR,
        ENGENHEIRO,
        SUPORTE,
        RH
    }

    public Tecnico(especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
