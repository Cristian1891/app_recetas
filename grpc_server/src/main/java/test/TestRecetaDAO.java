package test;

import dao.CategoriaDAO;
import dao.RecetaDAO;
import dao.UsuarioDAO;
import model.Categoria;
import model.Receta;
import model.Usuario;

public class TestRecetaDAO {
     public static void main(String[] args) {
        RecetaDAO dao = new RecetaDAO();
		UsuarioDAO daouser = new UsuarioDAO();
        Usuario user;
		CategoriaDAO daocat =new CategoriaDAO();
		Categoria categoria;
		try {
			user = daouser.getById(1);
			categoria = daocat.getById(1);
			Receta receta = new Receta("Arroz", user, categoria);
			System.out.println("\n\n----------------------------------");
		System.out.println("Test agregarReceta");
		try {
			System.out.println(dao.agregarReceta(receta));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        

		System.out.println("----------------------------------");
		System.out.println("Test getRecetaById");
		try {
			System.out.println(dao.getById(1));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		

		System.out.println("\n\n----------------------------------");
		System.out.println("Test traerTodo");
		try {
			System.out.println(dao.getAll());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
