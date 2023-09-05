package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="favorita")
public class Favorita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFavorita;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_usuario")
    private Usuario usuario;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_receta")
    private Receta receta;

    public Favorita() {
    }

    public Favorita(int idFavorita, Usuario usuario, Receta receta) {
        this.idFavorita = idFavorita;
        this.usuario = usuario;
        this.receta = receta;
    }

    public int getIdFavorita() {
        return idFavorita;
    }

    public void setIdFavorita(int idFavorita) {
        this.idFavorita = idFavorita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "Favorita [idFavorita=" + idFavorita + ", usuario=" + usuario + ", receta=" + receta + "]";
    }

    

    
}
