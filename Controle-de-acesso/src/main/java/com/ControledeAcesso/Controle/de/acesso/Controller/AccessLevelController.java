package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.AccessLevel;
import com.ControledeAcesso.Controle.de.acesso.Service.AccessLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/AccessLevel")
public class AccessLevelController {

    @Autowired
    AccessLevelService accessLevelService;

    @PostMapping
    public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.saveAccessLevel(accessLevel);
    }

    @GetMapping
    public List<AccessLevel> getAccessLevelList(){
        return accessLevelService.findAll();
    }

    @GetMapping("/{idAccessLevel}")
    public ResponseEntity<AccessLevel> getAccessLevelById(@PathVariable("idAccessLevel") Long idAccessLevel) throws Exception{
        return ResponseEntity.ok(accessLevelService.getById(idAccessLevel).orElseThrow(() ->
                new NoSuchElementException("AccessLevel not found")));
    }

    @PutMapping
    public AccessLevel updateAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.updateAccessLevel(accessLevel);
    }

    @DeleteMapping("/{idAccessLevel}")
    public ResponseEntity<AccessLevel>deleteAccessLevelById(@PathVariable("idAccessLevel") Long idAccessLevel) throws Exception{
        accessLevelService.deleteAccessLevelById(idAccessLevel);
        return (ResponseEntity<AccessLevel>) ResponseEntity.ok();
    }
}