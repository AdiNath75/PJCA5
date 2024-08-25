package org.idrice2.services;



import org.idrice2.entities.Classe;

public interface ClasseService{

    Iterable<Classe> getAllClasse();

    void deleteClasse(Classe classe);

    void saveClasse(Classe classe);

    Classe getClasseById(long id);


	
}