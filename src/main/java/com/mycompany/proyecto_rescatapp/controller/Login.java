/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.controller;

import com.mycompany.proyecto_rescatapp.entities.Usuarios;
import com.mycompany.proyecto_rescatapp.services.UsuariosFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "login")
@SessionScoped
public class Login implements Serializable {

    private String usuario;
    private String contrasenna;
    private Usuarios user = new Usuarios();
    @EJB
    private UsuariosFacadeLocal ufl;

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
    



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String iniciarSesion() {
        
        user = this.ufl.iniciarSesion(usuario, contrasenna);
        if (user.getIdUsuario()!=null) {
            HttpSession sesion = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            sesion.setAttribute("usuario",usuario);
            return "/view/index.xhtml?faces-redirect=true";
        } else {
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o contraseña incorrectos","Intente nuevamente");
            contexto.addMessage(null, fm);
            return null;
        }
    }
    
     public String cerrarSesion (){
         FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
         return "/login.xhtml?faces-redirect=true";
                 
     }
    
    public Login(){  
    }
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.controller;

import com.mycompany.proyecto_rescatapp.entities.Usuarios;
import com.mycompany.proyecto_rescatapp.services.UsuariosFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "login")
@SessionScoped
public class Login implements Serializable {

    private String usuario;
    private String contrasenna;
    private Usuarios user = new Usuarios();
    @EJB
    private UsuariosFacadeLocal ufl;

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
    



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String iniciarSesion() {
        
        user = this.ufl.iniciarSesion(usuario, contrasenna);
        if (user.getIdUsuario()!=null) {
            HttpSession sesion = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            sesion.setAttribute("usuario",usuario);
            return "/view/index.xhtml?faces-redirect=true";
        } else {
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o contraseña incorrectos","Intente nuevamente");
            contexto.addMessage(null, fm);
            return null;
        }
    }
    
     public String cerrarSesion (){
         FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
         return "/login.xhtml?faces-redirect=true";
                 
     }
    
    public Login(){  
    }
}