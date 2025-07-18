/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Animales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NITRO
 */
@Local
public interface AnimalesFacadeLocal {

    void create(Animales animales);

    void edit(Animales animales);

    void remove(Animales animales);

    Animales find(Object id);

    List<Animales> findAll();

    List<Animales> findRange(int[] range);

    int count();
    
}
