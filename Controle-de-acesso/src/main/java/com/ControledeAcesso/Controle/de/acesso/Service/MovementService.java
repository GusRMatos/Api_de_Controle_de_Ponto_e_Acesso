package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.Movement;
import com.ControledeAcesso.Controle.de.acesso.Repository.MovementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovementService {

    MovementRepository movementRepository;

    @Autowired
    public MovementService(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public Movement saveMovement(Movement movement) {
            return movementRepository.save(movement);
        }

    public List<Movement> findAll(){
        return movementRepository.findAll();
    }


    public Optional<Movement> getById(Long idMovement) {
        return movementRepository.findById(idMovement);
    }

    public Movement updateMovement(Movement movement){
        return movementRepository.save(movement);
    }

    public void deleteMovementById(Long idMovement) {
        movementRepository.deleteById(idMovement);
    }
}
