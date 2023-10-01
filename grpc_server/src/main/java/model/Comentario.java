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
@Table(name="comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private int idComentario;

    @Column(name="comentario")
    private String comentario;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_receta")
    private Receta receta;

    public Comentario() {
    }

    public Comentario(int idComentario, String comentario, Usuario usuario, Receta receta) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.usuario = usuario;
        this.receta = receta;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
    
    
}
