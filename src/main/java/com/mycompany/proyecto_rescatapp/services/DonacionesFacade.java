/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Donaciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NITRO
 */
@Stateless
public class DonacionesFacade extends AbstractFacade<Donaciones> implements DonacionesFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_proyecto_rescatapp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DonacionesFacade() {
        super(Donaciones.class);
    }
    
}
