package test;


import dao.CategoriaDAO;
import model.Categoria;


public class TestCategoriaDAO {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
		//Categoria cereales= new Categoria("cereales");

		System.out.println("----------------------------------");
		System.out.println("Test getCategoriaById");
		try {
			System.out.println(dao.getById(1));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
/* 
		System.out.println("\n\n----------------------------------");
		System.out.println("Test agregarCategoria");
		try {
			System.out.println(dao.agregarCategoria(cereales));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
*/
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
