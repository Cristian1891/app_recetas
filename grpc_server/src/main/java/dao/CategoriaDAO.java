package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.Categoria;



public class CategoriaDAO {
    private static CategoriaDAO instancia;

    public static CategoriaDAO getInstance(){
        if(instancia == null) {
			instancia = new CategoriaDAO();
		}
		return instancia;
    }

    // METODO agregarCategoria
	public Categoria agregarCategoria(Categoria categoria) throws Exception {

        EntityManager em = JPAUtil.getEMF().createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        Categoria entity = null;

		try {
            transaction.begin();
            entity = em.merge(categoria);
            transaction.commit();
		} // end_try
	    catch (Exception e){
	        String msg = "Error de persistencia - Método addCategoria: " + e.getMessage();
	        System.out.println(msg);
	        throw new Exception(msg);
	    }
		finally {
	        em.close();
	    }

		return entity;
	} // end_addCategoria

    // METODO getById
	public Categoria getById(int idCategoria) throws Exception{
		
		Categoria categoria = null;
		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT u FROM Categoria u WHERE u.idCategoria = :idCategoria";
		TypedQuery<Categoria> tq = em.createQuery(query, Categoria.class);
		tq.setParameter("idCategoria", idCategoria);
		
		try {
			categoria = tq.getSingleResult();
		} // end_try
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new Exception("ATENCION: Error de persistencia en método getById");
		} // end_catch
		finally {
			em.close();
		} // end_finally

		return categoria;
	} // getRecetaById

	public List<Categoria> getAll() throws Exception{
        List<Categoria> categorias = new ArrayList<Categoria>();

        EntityManager em = JPAUtil.getEMF().createEntityManager();
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Categoria> query = criteriaBuilder.createQuery(Categoria.class);
        Root<Categoria> root = query.from(Categoria.class);
        query.select(root);

        try {
            categorias = em.createQuery(query).getResultList();
        } catch (Exception e) {
            String msg = "Error de persistencia - Método GetAllProducto: " + e.getMessage();
            System.out.println(msg);
            throw new Exception(msg);
        } finally {
            em.close();
        }
        return categorias;
    }
}
