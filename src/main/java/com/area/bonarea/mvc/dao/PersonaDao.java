/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.bonarea.mvc.dao;

import com.area.bonarea.mvc.models.Persona;
import java.util.List;

/**
 *
 * @author xavier.verges
 */
public interface PersonaDao {

    Persona add(Persona persona);

    List<Persona> getAll();
}
