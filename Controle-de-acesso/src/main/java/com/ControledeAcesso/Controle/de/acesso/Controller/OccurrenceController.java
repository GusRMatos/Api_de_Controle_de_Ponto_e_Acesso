package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.Occurrence;
import com.ControledeAcesso.Controle.de.acesso.Service.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Occurrence")
public class OccurrenceController {

    @Autowired
    OccurrenceService occurrenceService;

    @PostMapping
    public Occurrence createOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.saveOccurrence(occurrence);
    }

    @GetMapping
    public List<Occurrence> getOccurrenceList(){
        return occurrenceService.findAll();
    }
    @GetMapping("/{idOccurrence}")
    public ResponseEntity<Occurrence> getOccurrenceById(@PathVariable("idOccurrence") Long idOccurrence) throws Exception{
        return ResponseEntity.ok(occurrenceService.getById(idOccurrence).orElseThrow(() ->
                new NoSuchElementException("Occurrence not found")));
    }

    @PutMapping
    public Occurrence updateOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.updateOccurrence(occurrence);
    }

    @DeleteMapping("/{idOccurrence}")
    public ResponseEntity<Occurrence>deleteOccurrenceById(@PathVariable("idOccurrence") Long idOccurrence) throws Exception{
        occurrenceService.deleteOccurrenceById(idOccurrence);
        return (ResponseEntity<Occurrence>) ResponseEntity.ok();
    }
}
