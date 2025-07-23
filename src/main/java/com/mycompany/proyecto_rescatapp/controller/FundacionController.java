/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.controller;

import com.mycompany.proyecto_rescatapp.entities.Fundaciones;
import com.mycompany.proyecto_rescatapp.services.FundacionesFacadeLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author NITRO
 */
@Named(value = "fundacionController")
@ViewScoped
public class FundacionController implements Serializable {
    
    private Fundaciones con = new Fundaciones();
    @EJB
    private FundacionesFacadeLocal ffl;

    public Fundaciones getCon() {
        return con;
    }

    public void setCon(Fundaciones con) {
        this.con = con;
    }
    
    public List<Fundaciones> obtenerFundaciones(){
        return this.ffl.findAll();
    }
    public FundacionController() {
    }
    public String crearP1 () {
        this.con = new Fundaciones();
        return "/view/fundations/createupdate.xhtml";
    }
    
    public void crearP2 () {
        
        try{
            this.ffl.create(con);
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Fundación Registrada","MSG_INFO");
            contexto.addMessage(null, fm);  
            this.con = new Fundaciones(); 
        } catch (Exception e) {
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Fundación Registrada","MSG_INFO");
            contexto.addMessage(null, fm); 
        }
    } 
}
