package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.AnnualLeave;
import com.ControledeAcesso.Controle.de.acesso.Service.AnnualLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/AnnualLeave")
public class AnnualLeaveController {

    @Autowired
    AnnualLeaveService annualLeaveService;

    @PostMapping
    public AnnualLeave createAnnualLeave(@RequestBody AnnualLeave annualLeave){
        return annualLeaveService.saveAnnualLeave(annualLeave);
    }

    @GetMapping
    public List<AnnualLeave> getAnnualLeaveList(){
        return annualLeaveService.findAll();
    }

    @GetMapping("/{idAnnualLeave}")
    public ResponseEntity<AnnualLeave> getAnnualLeaveById(@PathVariable("idAnnualLeave") Long idAnnualLeave) throws Exception{
        return ResponseEntity.ok(annualLeaveService.getById(idAnnualLeave).orElseThrow(() ->
                new NoSuchElementException("AnnualLeave not found")));
    }

    @PutMapping
    public AnnualLeave updateAnnualLeave(@RequestBody AnnualLeave annualLeave){
        return annualLeaveService.updateAnnualLeave(annualLeave);
    }

    @DeleteMapping("/{idAnnualLeave}")
    public ResponseEntity<AnnualLeave>deleteAnnualLeaveById(@PathVariable("idAnnualLeave") Long idAnnualLeave) throws Exception{
        annualLeaveService.deleteAnnualLeaveById(idAnnualLeave);
        return (ResponseEntity<AnnualLeave>) ResponseEntity.ok();
    }
}