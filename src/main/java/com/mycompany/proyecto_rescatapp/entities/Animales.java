/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_rescatapp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NITRO
 */
@Entity
@Table(name = "animales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Animales.findAll", query = "SELECT a FROM Animales a"),
    @NamedQuery(name = "Animales.findByIdAnimal", query = "SELECT a FROM Animales a WHERE a.idAnimal = :idAnimal"),
    @NamedQuery(name = "Animales.findByNombre", query = "SELECT a FROM Animales a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Animales.findByEdad", query = "SELECT a FROM Animales a WHERE a.edad = :edad"),
    @NamedQuery(name = "Animales.findByRaza", query = "SELECT a FROM Animales a WHERE a.raza = :raza")})
public class Animales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_animal")
    private Integer idAnimal;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private Integer edad;
    @Size(max = 100)
    @Column(name = "raza")
    private String raza;
    @Lob
    @Size(max = 65535)
    @Column(name = "estado_salud")
    private String estadoSalud;
    @OneToMany(mappedBy = "idAnimal", fetch = FetchType.LAZY)
    private List<Adopciones> adopcionesList;
    @JoinColumn(name = "id_reporte", referencedColumnName = "id_reporte")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reportes idReporte;

    public Animales() {
    }

    public Animales(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    @XmlTransient
    public List<Adopciones> getAdopcionesList() {
        return adopcionesList;
    }

    public void setAdopcionesList(List<Adopciones> adopcionesList) {
        this.adopcionesList = adopcionesList;
    }

    public Reportes getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Reportes idReporte) {
        this.idReporte = idReporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnimal != null ? idAnimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animales)) {
            return false;
        }
        Animales other = (Animales) object;
        if ((this.idAnimal == null && other.idAnimal != null) || (this.idAnimal != null && !this.idAnimal.equals(other.idAnimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto_rescatapp.entities.Animales[ idAnimal=" + idAnimal + " ]";
    }
    
}
