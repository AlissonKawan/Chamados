package br.com.alisson.resource;


import br.com.alisson.bo.ChamadoBO;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/chamados")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ChamadoResource {
    @Inject
    ChamadoBO  chamadoBO;

    @GET
    public Response listar() {
        return Response.ok(chamadoBO.listar()).build();
    }
}
