/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NITRO
 */
@Entity
@Table(name = "fundaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fundaciones.findAll", query = "SELECT f FROM Fundaciones f"),
    @NamedQuery(name = "Fundaciones.findByIdFundacion", query = "SELECT f FROM Fundaciones f WHERE f.idFundacion = :idFundacion"),
    @NamedQuery(name = "Fundaciones.findByNombre", query = "SELECT f FROM Fundaciones f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fundaciones.findByDireccion", query = "SELECT f FROM Fundaciones f WHERE f.direccion = :direccion"),
    @NamedQuery(name = "Fundaciones.findByTelefono", query = "SELECT f FROM Fundaciones f WHERE f.telefono = :telefono"),
    @NamedQuery(name = "Fundaciones.findByEmail", query = "SELECT f FROM Fundaciones f WHERE f.email = :email")})
public class Fundaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fundacion")
    private Integer idFundacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;

    public Fundaciones() {
    }

    public Fundaciones(Integer idFundacion) {
        this.idFundacion = idFundacion;
    }

    public Fundaciones(Integer idFundacion, String nombre, String direccion) {
        this.idFundacion = idFundacion;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Integer getIdFundacion() {
        return idFundacion;
    }

    public void setIdFundacion(Integer idFundacion) {
        this.idFundacion = idFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFundacion != null ? idFundacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fundaciones)) {
            return false;
        }
        Fundaciones other = (Fundaciones) object;
        if ((this.idFundacion == null && other.idFundacion != null) || (this.idFundacion != null && !this.idFundacion.equals(other.idFundacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto_rescatapp.entities.Fundaciones[ idFundacion=" + idFundacion + " ]";
    }
    
}
