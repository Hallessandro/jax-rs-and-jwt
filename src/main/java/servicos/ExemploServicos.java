/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author João
 */
@Path("exemplo")
public class ExemploServicos {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloWorld(){
        return "Hello World";
    }
    
    @GET
    @Path("alunos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAlunos(){
        List<String> alunos = new ArrayList();
        alunos.add("Anézio");
        alunos.add("Marcelo");
        alunos.add("Caio");
        alunos.add("Wendell");
        return Response.ok(alunos).build();
    }
    
    @GET
    @Seguro
    @Path("seguro")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTexto(){
        return "recurso seguro";
    }
}
