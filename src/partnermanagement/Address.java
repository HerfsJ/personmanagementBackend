package partnermanagement;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address extends BaseClass{
	
	private String street;
	private String zip;
	private String city;
	
	@ManyToOne
	private Person person;
	
	public Address() {
		
	}
}
