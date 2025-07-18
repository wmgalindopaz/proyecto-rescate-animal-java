/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NITRO
 */
@Entity
@Table(name = "adopciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adopciones.findAll", query = "SELECT a FROM Adopciones a"),
    @NamedQuery(name = "Adopciones.findByIdAdopcion", query = "SELECT a FROM Adopciones a WHERE a.idAdopcion = :idAdopcion"),
    @NamedQuery(name = "Adopciones.findByFechaAdopcion", query = "SELECT a FROM Adopciones a WHERE a.fechaAdopcion = :fechaAdopcion")})
public class Adopciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_adopcion")
    private Integer idAdopcion;
    @Column(name = "fecha_adopcion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAdopcion;
    @JoinColumn(name = "id_animal", referencedColumnName = "id_animal")
    @ManyToOne(fetch = FetchType.LAZY)
    private Animales idAnimal;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios idUsuario;

    public Adopciones() {
    }

    public Adopciones(Integer idAdopcion) {
        this.idAdopcion = idAdopcion;
    }

    public Integer getIdAdopcion() {
        return idAdopcion;
    }

    public void setIdAdopcion(Integer idAdopcion) {
        this.idAdopcion = idAdopcion;
    }

    public Date getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(Date fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public Animales getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Animales idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdopcion != null ? idAdopcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adopciones)) {
            return false;
        }
        Adopciones other = (Adopciones) object;
        if ((this.idAdopcion == null && other.idAdopcion != null) || (this.idAdopcion != null && !this.idAdopcion.equals(other.idAdopcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto_rescatapp.entities.Adopciones[ idAdopcion=" + idAdopcion + " ]";
    }
    
}
