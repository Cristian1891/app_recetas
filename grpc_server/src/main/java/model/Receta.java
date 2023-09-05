package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="receta")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_receta")
    private int idReceta;

    @Column(name="nombre")
    private String nombre;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @ManyToOne (cascade={CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn (name = "id_categoria", referencedColumnName = "id_categoria")
    private Categoria categoria;

    @OneToMany(mappedBy = "receta")
    private List<Foto> fotos;

    @OneToMany(mappedBy = "receta")
    private List<Favorita> favoritas;

    public Receta() {
    }

    public Receta(String nombre, Usuario usuario, Categoria categoria) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public List<Favorita> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(List<Favorita> favoritas) {
        this.favoritas = favoritas;
    }

    @Override
    public String toString() {
        return "Receta [idReceta=" + idReceta + ", nombre=" + nombre + ", usuario=" + usuario + ", categoria="
                + categoria + "]";
    }

    
    
   
    
}
