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
@Table(name="seguimiento")
public class Seguimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSeguimiento;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_usuario")
    private Usuario usuario;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_usuario_seguido")
    private Usuario usuarioSeguido;

    public Seguimiento() {
    }

    public Seguimiento(int idSeguimiento, Usuario usuario, Usuario usuarioSeguido) {
        this.idSeguimiento = idSeguimiento;
        this.usuario = usuario;
        this.usuarioSeguido = usuarioSeguido;
    }

    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    public void setIdSeguimiento(int idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioSeguido() {
        return usuarioSeguido;
    }

    public void setUsuarioSeguido(Usuario usuarioSeguido) {
        this.usuarioSeguido = usuarioSeguido;
    }

    @Override
    public String toString() {
        return "Seguimiento [idSeguimiento=" + idSeguimiento + ", usuario=" + usuario + ", usuarioSeguido="
                + usuarioSeguido + "]";
    }

    

    
}
