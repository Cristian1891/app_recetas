package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.Comentario;


public class ComentarioDAO {
    private static ComentarioDAO instancia;

    public static ComentarioDAO getInstance(){
        if(instancia == null) {
			instancia = new ComentarioDAO();
		}
		return instancia;
    }

    // METODO agregarComentario
	public Comentario agregarComentario(Comentario comentario) throws Exception {

        EntityManager em = JPAUtil.getEMF().createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        Comentario entity = null;

		try {
            transaction.begin();
            entity = em.merge(comentario);
            transaction.commit();
		} // end_try
	    catch (Exception e){
	        String msg = "Error de persistencia - Método addComentario: " + e.getMessage();
	        System.out.println(msg);
	        throw new Exception(msg);
	    }
		finally {
	        em.close();
	    }

		return entity;
	} // end_addComentario

    // METODO getById
	public Comentario getById(int idComentario) throws Exception{
		
		Comentario comentario = null;
		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT u FROM Comentario u WHERE u.idComentario = :idComentario";
		TypedQuery<Comentario> tq = em.createQuery(query, Comentario.class);
		tq.setParameter("idComentario", idComentario);
		
		try {
			comentario = tq.getSingleResult();
		} // end_try
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new Exception("ATENCION: Error de persistencia en método getById");
		} // end_catch
		finally {
			em.close();
		} // end_finally

		return comentario;
	} // getComentarioById

	public List<Comentario> getAll() {
		List<Comentario> comentarios = new ArrayList<Comentario>();

        EntityManager em = JPAUtil.getEMF().createEntityManager();
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Comentario> query = criteriaBuilder.createQuery(Comentario.class);
		Root<Comentario> root = query.from(Comentario.class);
        query.select(root);

        try {
            comentarios = em.createQuery(query).getResultList();
        } catch (Exception e) {
            String msg = "Error de persistencia - Método GetAllComentario: " + e.getMessage();
            System.out.println(msg);
        } finally {
            em.close();
        }
        return comentarios;
	}
}