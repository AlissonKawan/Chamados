package br.com.alisson.bo;

import br.com.alisson.dao.ChamadoDAO;
import br.com.alisson.model.Chamado;
import br.com.alisson.model.Tecnico;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ChamadoBO {
    @Inject
    ChamadoDAO chamadoDAO;

    public Chamado assumirChamado(Chamado chamado, Tecnico tecnico) {
        if (chamado.getStatus() == Chamado.Status.ABERTO ) {
           chamado.assumir(tecnico);
        } else{
            throw new IllegalArgumentException("Chamado ja foi assumido ou resolvido");
        }
        chamadoDAO.atualizar(chamado);
        return chamado;
    }
}
