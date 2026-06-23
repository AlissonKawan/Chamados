package br.com.alisson.dto;

import br.com.alisson.model.Chamado;

import java.time.LocalDateTime;

public class criarChamadoResponse {
    private int id;
    private String mensagem;
    private String status;
    private LocalDateTime dataCriacao;
}
