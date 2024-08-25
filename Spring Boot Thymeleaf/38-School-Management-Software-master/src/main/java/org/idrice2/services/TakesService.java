package org.idrice2.services;

import org.idrice2.entities.Takes;

public interface TakesService {

	Iterable<Takes> listAllTakes();

	void saveTakes(Takes takes);

	Takes findById(long id);

	void deleteTakes(Takes takes);
    
}
