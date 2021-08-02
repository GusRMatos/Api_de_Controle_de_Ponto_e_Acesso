package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.Movement;
import com.ControledeAcesso.Controle.de.acesso.Service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Movement")
public class MovementController {

    @Autowired
    MovementService movementService;

    @PostMapping
    public Movement createMovement(@RequestBody Movement movement){
        return movementService.saveMovement(movement);
    }

    @GetMapping
    public List<Movement> getMovementList(){
        return movementService.findAll();
    }

    @GetMapping("/{idMovement}")
    public ResponseEntity<Movement> getMovementById(@PathVariable("idMovement") Long idMovement) throws Exception{
        return ResponseEntity.ok(movementService.getById(idMovement).orElseThrow(() ->
                new NoSuchElementException("Movement not found")));
    }

    @PutMapping
    public Movement updateMovement(@RequestBody Movement movement){
        return movementService.updateMovement(movement);
    }

    @DeleteMapping("/{idMovement}")
    public ResponseEntity<Movement>deleteMovementById(@PathVariable("idMovement") Long idMovement) throws Exception{
        movementService.deleteMovementById(idMovement);
        return (ResponseEntity<Movement>) ResponseEntity.ok();
    }
}