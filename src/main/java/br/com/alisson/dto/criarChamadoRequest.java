package br.com.alisson.dto;

import br.com.alisson.model.Chamado;

public class criarChamadoRequest {
    private String titulo;
    private String descricao;
    private String categoria;
    private Chamado.Prioridade prioridade;
}
