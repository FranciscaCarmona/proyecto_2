/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2.demo.modelo;

import java.io.Serializable;
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
import javax.validation.constraints.Size;

/**
 *
 * @author Francisca Carmona
 */
@Entity
@Table(name = "resena")
@NamedQueries({
    @NamedQuery(name = "Resena.findAll", query = "SELECT r FROM Resena r")})
public class Resena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Comentario")
    private String comentario;
    @Column(name = "Puntaje")
    private Integer puntaje;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_resena")
    private Integer idResena;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
    @ManyToOne(fetch = FetchType.LAZY)
    private Servicio servicio;

    public Resena() {
    }

    public Resena(Integer idReseña) {
        this.idResena = idReseña;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getIdResena() {
        return idResena;
    }

    public void setIdResena(Integer idReseña) {
        this.idResena = idReseña;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResena != null ? idResena.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resena)) {
            return false;
        }
        Resena other = (Resena) object;
        if ((this.idResena == null && other.idResena != null) || (this.idResena != null && !this.idResena.equals(other.idResena))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto_2.demo.modelo.Resena[ idResena=" + idResena + " ]";
    }
    
}
