package partnermanagement;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

public class PersonEventHandler {
	@RepositoryEventHandler(BaseClass.class) 
	public class AuthorEventHandler {
	    
		
		
	    @HandleBeforeCreate
	    public void handleAuthorBeforeCreate(BaseClass author){
	    	System.out.println("x");
	    }

	    @HandleAfterCreate
	    public void handleAuthorAfterCreate(BaseClass author){
	    	System.out.println("x");
	    }

	    @HandleBeforeDelete
	    public void handleAuthorBeforeDelete(BaseClass author){
	    	System.out.println("x");
	    }

	    @HandleAfterDelete
	    public void handleAuthorAfterDelete(BaseClass author){
	    	System.out.println("x");
	    }
	}
}
