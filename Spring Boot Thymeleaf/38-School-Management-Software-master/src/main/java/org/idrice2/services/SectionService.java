package org.idrice2.services;

import org.idrice2.entities.Section;

public interface SectionService {

    void deleteSection(Section section);

    Iterable<Section> getAllSection();

    void saveSection(Section section);

    Section getSectionById(long id);
    
}
