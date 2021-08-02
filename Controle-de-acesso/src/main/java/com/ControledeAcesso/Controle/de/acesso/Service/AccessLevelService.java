package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.AccessLevel;
import com.ControledeAcesso.Controle.de.acesso.Repository.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccessLevelService {

    AccessLevelRepository accessLevelRepository;

    @Autowired
    public AccessLevelService(AccessLevelRepository accessLevelRepository) {
        this.accessLevelRepository = accessLevelRepository;
    }

    public AccessLevel saveAccessLevel(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }

    public List<AccessLevel> findAll() {
        return accessLevelRepository.findAll();
    }

    public Optional<AccessLevel> getById(Long idAccessLevel) {
        return accessLevelRepository.findById(idAccessLevel);
    }

    public AccessLevel updateAccessLevel(AccessLevel accessLevel){
        return accessLevelRepository.save(accessLevel);
    }

    public void deleteAccessLevelById(Long idAccessLevel) {
        accessLevelRepository.deleteById(idAccessLevel);
    }
}
