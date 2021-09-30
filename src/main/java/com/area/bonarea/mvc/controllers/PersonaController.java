/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.bonarea.mvc.controllers;

import com.area.bonarea.mvc.models.Persona;
import com.area.bonarea.mvc.services.PersonaService;
import com.oracle.ozark.core.Models;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author xavier.verges
 */
@Path("/saludo")
@Controller
public class PersonaController {
    
    @Inject
    private Models models;
    
    @Inject
    private PersonaService personaService;

    @GET
    public String hola() {
        return "/WEB-INF/jsp/saludo.jsp";
    }
    
    @POST
    @Path("/nombre")
    public String holaNombre(@FormParam("nombre") String nombre){
        String mensaje = "Hola " + nombre;
        models.put("mensaje", mensaje);
        return "/SEB-INF/jsp/saludo-nombre.jsp";
    }
    
    @POST
    @Path("/nombre-apellidos")
    public String holaNombre(@BeanParam Persona persona){
        String result = "/SEB-INF/jsp/saludo-nombre-apellidos.jsp";
        models.put("persona", persona);
        return result;
    }
}
