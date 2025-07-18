/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Fundaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NITRO
 */
@Local
public interface FundacionesFacadeLocal {

    void create(Fundaciones fundaciones);

    void edit(Fundaciones fundaciones);

    void remove(Fundaciones fundaciones);

    Fundaciones find(Object id);

    List<Fundaciones> findAll();

    List<Fundaciones> findRange(int[] range);

    int count();
    
}
