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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NITRO
 */
@Entity
@Table(name = "campanias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campanias.findAll", query = "SELECT c FROM Campanias c"),
    @NamedQuery(name = "Campanias.findByIdCampania", query = "SELECT c FROM Campanias c WHERE c.idCampania = :idCampania"),
    @NamedQuery(name = "Campanias.findByTitulo", query = "SELECT c FROM Campanias c WHERE c.titulo = :titulo"),
    @NamedQuery(name = "Campanias.findByFechaInicio", query = "SELECT c FROM Campanias c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Campanias.findByFechaFin", query = "SELECT c FROM Campanias c WHERE c.fechaFin = :fechaFin"),
    @NamedQuery(name = "Campanias.findByEstado", query = "SELECT c FROM Campanias c WHERE c.estado = :estado")})
public class Campanias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_campania")
    private Integer idCampania;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Lob
    @Size(max = 65535)
    @Column(name = "imagen_url")
    private String imagenUrl;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_administrador", referencedColumnName = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios idAdministrador;

    public Campanias() {
    }

    public Campanias(Integer idCampania) {
        this.idCampania = idCampania;
    }

    public Campanias(Integer idCampania, String titulo) {
        this.idCampania = idCampania;
        this.titulo = titulo;
    }

    public Integer getIdCampania() {
        return idCampania;
    }

    public void setIdCampania(Integer idCampania) {
        this.idCampania = idCampania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuarios getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Usuarios idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCampania != null ? idCampania.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campanias)) {
            return false;
        }
        Campanias other = (Campanias) object;
        if ((this.idCampania == null && other.idCampania != null) || (this.idCampania != null && !this.idCampania.equals(other.idCampania))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto_rescatapp.entities.Campanias[ idCampania=" + idCampania + " ]";
    }
    
}
