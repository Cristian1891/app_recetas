package test;

import dao.UsuarioDAO;
import model.Usuario;

public class TestUsuarioDAO {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();
		Usuario user = new Usuario("Juan", "Perez", "jp@gmail.com", "jp12", "1234");

		System.out.println("----------------------------------");
		System.out.println("Test getUsuarioById");
		try {
			System.out.println(dao.getById(2));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n\n----------------------------------");
		System.out.println("Test getUsuarioByUsuario");
		try {
			System.out.println(dao.getByNombreUsuario("Paddy"));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n\n----------------------------------");
		System.out.println("Test agregarUsuario");
		try {
			System.out.println(dao.agregarUsuario(user));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
