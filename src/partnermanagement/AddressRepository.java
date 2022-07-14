package partnermanagement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "addresses")
public interface AddressRepository extends CrudRepository<Address, String> {}
