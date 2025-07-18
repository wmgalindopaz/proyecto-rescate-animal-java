/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Fundaciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NITRO
 */
@Stateless
public class FundacionesFacade extends AbstractFacade<Fundaciones> implements FundacionesFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_proyecto_rescatapp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FundacionesFacade() {
        super(Fundaciones.class);
    }
    
}
