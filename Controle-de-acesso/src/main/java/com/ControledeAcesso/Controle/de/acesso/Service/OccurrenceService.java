package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.Occurrence;
import com.ControledeAcesso.Controle.de.acesso.Repository.OccurrenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OccurrenceService {

    OccurrenceRepository occurrenceRepository;

    @Autowired
    public OccurrenceService(OccurrenceRepository occurrenceRepository) {
        this.occurrenceRepository = occurrenceRepository;
    }

    public Occurrence saveOccurrence(Occurrence occurrence) {
        return occurrenceRepository.save(occurrence);
    }

    public List<Occurrence> findAll(){
        return occurrenceRepository.findAll();
    }


    public Optional<Occurrence> getById(Long idOccurrence) {
        return occurrenceRepository.findById(idOccurrence);
    }

    public Occurrence updateOccurrence(Occurrence occurrence){
        return occurrenceRepository.save(occurrence);
    }

    public void deleteOccurrenceById(Long idOccurrence) {
        occurrenceRepository.deleteById(idOccurrence);
    }
}

