package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		/**Criação de objetos:
		 * Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		 *Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		 *Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		 */
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa-postgre");
		EntityManager em = emf.createEntityManager();
		
		/**Criando tabela com objetos no banco de dados:
		 * em.getTransaction().begin();
		 *em.persist(p1);
		 *em.persist(p2);
		 *em.persist(p3);
		 *em.getTransaction().commit();
		 */
		
		//buscar pessoa no banco de dados:
 		 Pessoa p = em.find(Pessoa.class, 2);
				
		//removendo objeto monitorado do banco de dados:
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
