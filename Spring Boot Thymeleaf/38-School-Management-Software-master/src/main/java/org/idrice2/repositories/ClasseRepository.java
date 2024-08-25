package org.idrice2.repositories;

import org.idrice2.entities.Classe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClasseRepository extends CrudRepository<Classe, Long>{
    Classe findById(long id);
}