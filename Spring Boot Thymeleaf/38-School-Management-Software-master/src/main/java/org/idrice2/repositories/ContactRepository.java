package org.idrice2.repositories;

import org.idrice2.entities.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository()
public interface ContactRepository extends CrudRepository<Contact, Long>{
	Contact findById(long id);
}
