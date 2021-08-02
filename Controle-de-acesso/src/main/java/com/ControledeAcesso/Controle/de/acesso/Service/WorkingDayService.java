package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.WorkingDay;
import com.ControledeAcesso.Controle.de.acesso.Repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {


    WorkingDayRepository workingDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workingDayRepository) {
        this.workingDayRepository = workingDayRepository;
    }

    public WorkingDay saveWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public List<WorkingDay> findAll(){
        return workingDayRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long idWorkingDay) {
        return workingDayRepository.findById(idWorkingDay);
    }

    public WorkingDay updateWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public void deleteWorkingDayById(Long idWorkingDay) {
        workingDayRepository.deleteById(idWorkingDay);
    }

}
