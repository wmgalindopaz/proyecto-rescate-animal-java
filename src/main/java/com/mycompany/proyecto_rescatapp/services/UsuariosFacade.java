/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.services;

import com.mycompany.proyecto_rescatapp.entities.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author NITRO
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> implements UsuariosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_proyecto_rescatapp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    
    @Override
    public Usuarios iniciarSesion(String usuario, String password){
        Query query = em.createQuery("SELECT U from Usuarios U where U.username = :usuario and U.contrasena = :password");
        query.setParameter("usuario", usuario);
        query.setParameter("password", password);
        
        try {
            return (Usuarios) query.getSingleResult();
        } catch (Exception e) {
        }
        Usuarios usuarioInvalido = new Usuarios();
        return usuarioInvalido;
    }
    
}
