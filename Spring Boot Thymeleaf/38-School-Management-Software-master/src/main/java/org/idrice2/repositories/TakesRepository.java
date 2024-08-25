package org.idrice2.repositories;

import org.idrice2.entities.Takes;
import org.springframework.data.repository.CrudRepository;

public interface TakesRepository extends CrudRepository<Takes, Long> {
    Takes findById(long id);
}
