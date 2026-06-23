package br.com.alisson.model;

public class Tecnico {
    private int id;
    public enum especialidade {
        ANALISTA,
        DESENVOLVEDOR,
        ENGENHEIRO,
        SUPORTE,
        RH
    }
    private especialidade especialidade;

    public Tecnico(especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
