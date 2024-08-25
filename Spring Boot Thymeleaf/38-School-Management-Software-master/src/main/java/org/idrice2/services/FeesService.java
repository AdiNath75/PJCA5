package org.idrice2.services;




import org.idrice2.entities.Fees;
import org.idrice2.entities.Student;


public interface FeesService {

    Iterable<Fees> getAllFees();

    void save(Fees fees);

    Fees findById(long id);
    
    void delete(Fees fees);

    Student findBySui(String string);

    long count();
    
}
