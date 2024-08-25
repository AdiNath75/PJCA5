package org.idrice2.repositories;

import org.idrice2.entities.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SectionRepository extends CrudRepository<Section, Long>{
    Section findById(long id);
}