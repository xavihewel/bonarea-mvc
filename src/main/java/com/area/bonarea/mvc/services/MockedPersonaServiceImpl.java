/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.bonarea.mvc.services;

import com.area.bonarea.mvc.models.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author xavier.verges
 */
@Alternative
public class MockedPersonaServiceImpl implements PersonaService {

    @Override
    public Persona add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> getAll() {
        List<Persona> personaList = new ArrayList<Persona>();

        Persona persona1 = new Persona();
        persona1.setNombre("Pepe");
        persona1.setApellidos("Soto");
        personaList.add(persona1);

        Persona persona2 = new Persona();
        persona2.setNombre("Jordi");
        persona2.setApellidos("Exposito");
        personaList.add(persona2);

        return personaList;
    }
}
