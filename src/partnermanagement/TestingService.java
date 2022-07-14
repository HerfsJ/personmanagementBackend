package partnermanagement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class TestingService {
	
	  @PersistenceContext
	  private EntityManager entityManager;
	  
	  @Autowired
	  PersonRepository personRep;
	  
}
