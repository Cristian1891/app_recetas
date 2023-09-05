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
@Table(name="ingrediente")
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingrediente")
    private int idIngrediente;

    @Column(name="descripcion_ingrediente")
    private String descripcion;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_detalle", referencedColumnName = "id_detalle")
    private Detalle detalle;

    public Ingrediente() {
    }

    public Ingrediente(String descripcion, Detalle detalle) {
        this.descripcion = descripcion;
        this.detalle = detalle;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
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
        return "Ingrediente [idIngrediente=" + idIngrediente + ", descripcion=" + descripcion + ", detalle=" + detalle
                + "]";
    }

    
    
    

    
}
