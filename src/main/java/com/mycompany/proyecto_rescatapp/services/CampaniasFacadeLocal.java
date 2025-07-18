/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Campanias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NITRO
 */
@Local
public interface CampaniasFacadeLocal {

    void create(Campanias campanias);

    void edit(Campanias campanias);

    void remove(Campanias campanias);

    Campanias find(Object id);

    List<Campanias> findAll();

    List<Campanias> findRange(int[] range);

    int count();
    
}
