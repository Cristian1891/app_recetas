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
import model.Receta;


public class RecetaDAO {
    private static RecetaDAO instancia;

    public static RecetaDAO getInstance(){
        if(instancia == null) {
			instancia = new RecetaDAO();
		}
		return instancia;
    }

    // METODO agregarReceta
	public Receta agregarReceta(Receta receta) throws Exception {

        EntityManager em = JPAUtil.getEMF().createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        Receta entity = null;

		try {
            transaction.begin();
            entity = em.merge(receta);
            transaction.commit();
		} // end_try
	    catch (Exception e){
	        String msg = "Error de persistencia - Método addReceta: " + e.getMessage();
	        System.out.println(msg);
	        throw new Exception(msg);
	    }
		finally {
	        em.close();
	    }

		return entity;
	} // end_addReceta

    // METODO getById
	public Receta getById(int idReceta) throws Exception{
		
		Receta receta = null;
		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT u FROM Receta u WHERE u.idReceta = :idReceta";
		TypedQuery<Receta> tq = em.createQuery(query, Receta.class);
		tq.setParameter("idReceta", idReceta);
		
		try {
			receta = tq.getSingleResult();
		} // end_try
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new Exception("ATENCION: Error de persistencia en método getById");
		} // end_catch
		finally {
			em.close();
		} // end_finally

		return receta;
	} // getRecetaById

	public List<Receta> getAll() {
		List<Receta> recetas = new ArrayList<Receta>();

        EntityManager em = JPAUtil.getEMF().createEntityManager();
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Receta> query = criteriaBuilder.createQuery(Receta.class);
		Root<Receta> root = query.from(Receta.class);
        query.select(root);

        try {
            recetas = em.createQuery(query).getResultList();
        } catch (Exception e) {
            String msg = "Error de persistencia - Método GetAllProducto: " + e.getMessage();
            System.out.println(msg);
        } finally {
            em.close();
        }
        return recetas;
	}
}
