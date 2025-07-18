/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Adopciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NITRO
 */
@Local
public interface AdopcionesFacadeLocal {

    void create(Adopciones adopciones);

    void edit(Adopciones adopciones);

    void remove(Adopciones adopciones);

    Adopciones find(Object id);

    List<Adopciones> findAll();

    List<Adopciones> findRange(int[] range);

    int count();
    
}
