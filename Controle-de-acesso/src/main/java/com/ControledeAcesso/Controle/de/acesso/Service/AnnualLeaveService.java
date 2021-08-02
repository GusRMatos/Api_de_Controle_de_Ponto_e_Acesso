package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.AnnualLeave;
import com.ControledeAcesso.Controle.de.acesso.Repository.AnnualLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnualLeaveService {

    AnnualLeaveRepository annualLeaveRepository;

    @Autowired
    public AnnualLeaveService(AnnualLeaveRepository annualLeaveRepository) {
        this.annualLeaveRepository = annualLeaveRepository;
    }

    public AnnualLeave saveAnnualLeave(AnnualLeave annualLeave) {
        return annualLeaveRepository.save(annualLeave);
    }

    public List<AnnualLeave> findAll() {
        return annualLeaveRepository.findAll();
    }

    public Optional<AnnualLeave> getById(Long idAnnualLeave) {
        return annualLeaveRepository.findById(idAnnualLeave);
    }

    public AnnualLeave updateAnnualLeave(AnnualLeave annualLeave){
        return annualLeaveRepository.save(annualLeave);
    }

    public void deleteAnnualLeaveById(Long idAnnualLeave) {
        annualLeaveRepository.deleteById(idAnnualLeave);
    }
}

