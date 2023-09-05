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
@Table(name="foto")
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_foto")
    private int idFoto;

    @Column(name="ruta_imagen")
    private String ruta;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_detalle", referencedColumnName = "id_detalle")
    private Detalle detalle;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_receta", referencedColumnName = "id_receta")
    private Receta receta;

    public Foto() {
    }

    public Foto(String ruta, Detalle detalle, Receta receta) {
        this.ruta = ruta;
        this.detalle = detalle;
        this.receta = receta;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "Foto [idFoto=" + idFoto + ", ruta=" + ruta + ", detalle=" + detalle + ", receta=" + receta + "]";
    }

    

    
}
