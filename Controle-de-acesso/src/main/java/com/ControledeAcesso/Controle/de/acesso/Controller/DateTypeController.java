package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.DateType;
import com.ControledeAcesso.Controle.de.acesso.Service.DateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/DateType")
public class DateTypeController {

    @Autowired
    DateTypeService dateTypeService;

    @PostMapping
    public DateType createDateType(@RequestBody DateType dateType){
        return dateTypeService.saveDateType(dateType);
    }

    @GetMapping
    public List<DateType> getDateTypeList(){
        return dateTypeService.findAll();
    }

    @GetMapping("/{idDateType}")
    public ResponseEntity<DateType> getDateTypeById(@PathVariable("idDateType") Long idDateType) throws Exception{
        return ResponseEntity.ok(dateTypeService.getById(idDateType).orElseThrow(() ->
                new NoSuchElementException("DateType not found")));
    }

    @PutMapping
    public DateType updateDateType(@RequestBody DateType dateType){
        return dateTypeService.updateDateType(dateType);
    }

    @DeleteMapping("/{idDateType}")
    public ResponseEntity<DateType>deleteDateTypeById(@PathVariable("idDateType") Long idDateType) throws Exception{
        dateTypeService.deleteDateTypeById(idDateType);
        return (ResponseEntity<DateType>) ResponseEntity.ok();
    }
}
