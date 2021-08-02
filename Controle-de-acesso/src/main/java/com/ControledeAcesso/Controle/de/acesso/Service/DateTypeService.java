package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.DateType;
import com.ControledeAcesso.Controle.de.acesso.Repository.DateTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DateTypeService {

    DateTypeRepository dateTypeRepository;

    @Autowired
    public DateTypeService(DateTypeRepository dateTypeRepository) {
        this.dateTypeRepository = dateTypeRepository;
    }

    public DateType saveDateType(DateType dateType) {
        return dateTypeRepository.save(dateType);
    }

    public List<DateType> findAll() {
        return dateTypeRepository.findAll();
    }


    public Optional<DateType> getById(Long idDateType) {
        return dateTypeRepository.findById(idDateType);
    }

    public DateType updateDateType(DateType dateType){
        return dateTypeRepository.save(dateType);
    }

    public void deleteDateTypeById(Long idDateType) {
        dateTypeRepository.deleteById(idDateType);
    }
}
