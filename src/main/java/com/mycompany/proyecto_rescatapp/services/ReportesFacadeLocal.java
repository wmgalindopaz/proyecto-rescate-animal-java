/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Reportes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NITRO
 */
@Local
public interface ReportesFacadeLocal {

    void create(Reportes reportes);

    void edit(Reportes reportes);

    void remove(Reportes reportes);

    Reportes find(Object id);

    List<Reportes> findAll();

    List<Reportes> findRange(int[] range);

    int count();
    
}
