package partnermanagement;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor   
public class Person extends BaseClass{

	private String FIRSTNAME;
	private String LASTNAME;
	
	@OneToMany
	private List<Address> addresses;
}
