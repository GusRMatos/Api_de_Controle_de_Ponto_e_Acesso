package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.Company;
import com.ControledeAcesso.Controle.de.acesso.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository dateTypeRepository) {
        this.companyRepository = companyRepository;
    }

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Optional<Company> getById(Long idCompany) {
        return companyRepository.findById(idCompany);
    }

    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }

    public void deleteCompanyById(Long idCompany) {
        companyRepository.deleteById(idCompany);
    }
}
