package partnermanagement;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Persistence;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceIdGenerator")  
	@GenericGenerator(
	        name = "sequenceIdGenerator", 
	        strategy = "partnermanagement.IDGenerator",
	        parameters = @Parameter(
	                name = SequenceStyleGenerator.CONFIG_PREFER_SEQUENCE_PER_ENTITY,
	                value = "true"))
	private String ID;
	
	
	public void store() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(this);
	}
	
}