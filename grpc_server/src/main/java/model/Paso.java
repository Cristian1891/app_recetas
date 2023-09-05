package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="paso")
public class Paso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paso")
    private int idPaso;

    @Column(name="descripcion_paso")
    private String descripcion;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_detalle", referencedColumnName = "id_detalle")
    private Detalle detalle;

    public Paso() {
    }

    public Paso(String descripcion, Detalle detalle) {
        this.descripcion = descripcion;
        this.detalle = detalle;
    }

    public int getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(int idPaso) {
        this.idPaso = idPaso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Paso [idPaso=" + idPaso + ", descripcion=" + descripcion + ", detalle=" + detalle + "]";
    }

    

    
}
