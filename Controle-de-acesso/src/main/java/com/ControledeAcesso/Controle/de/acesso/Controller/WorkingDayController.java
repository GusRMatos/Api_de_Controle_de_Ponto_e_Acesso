package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.WorkingDay;
import com.ControledeAcesso.Controle.de.acesso.Service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/WorkingDay")
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingday){
        return workingDayService.saveWorkingDay(workingday);
    }

    @GetMapping
    public List<WorkingDay> getWorkingDayList(){
        return workingDayService.findAll();
    }

    @GetMapping("/{idWorkingDay}")
    public ResponseEntity<WorkingDay>getWorkingDayById(@PathVariable("idWorkingDay") Long idWorkingDay) throws Exception{
        return ResponseEntity.ok(workingDayService.getById(idWorkingDay).orElseThrow(() ->
                new NoSuchElementException("WorkingDay not found")));
    }

    @PutMapping
    public WorkingDay updateWorkingDay(@RequestBody WorkingDay workingday){
        return workingDayService.updateWorkingDay(workingday);
    }

    @DeleteMapping("/{idWorkingDay}")
    public ResponseEntity<WorkingDay>deleteWorkingDayById(@PathVariable("idWorkingDay") Long idWorkingDay) throws Exception{
        workingDayService.deleteWorkingDayById(idWorkingDay);
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();
    }

}
