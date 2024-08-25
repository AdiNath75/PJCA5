package org.idrice2.services;

import org.idrice2.entities.Takes;
import org.idrice2.repositories.TakesRepository;
import org.springframework.stereotype.Service;

@Service
public class TakesServiceImpl implements TakesService {
    private TakesRepository takesRepository;


    @Override
    public Iterable<Takes> listAllTakes() {
        return takesRepository.findAll();
    }

    @Override
    public void saveTakes(Takes takes) {
        
        takesRepository.save(takes);
    }

    @Override
    public Takes findById(long id) {
        return takesRepository.findById(id);
    }

    @Override
    public void deleteTakes(Takes takes) {
        takesRepository.delete(takes);
        
    }
    
}
