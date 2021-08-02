package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.Company;
import com.ControledeAcesso.Controle.de.acesso.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return companyService.saveCompany(company);
    }

    @GetMapping
    public List<Company> getCompanyList(){
        return companyService.findAll();
    }

    @GetMapping("/{idCompany}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("idCompany") Long idCompany) throws Exception{
        return ResponseEntity.ok(companyService.getById(idCompany).orElseThrow(() ->
                new NoSuchElementException("Company not found")));
    }

    @PutMapping
    public Company updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @DeleteMapping("/{idCompany}")
    public ResponseEntity<Company>deleteCompanyById(@PathVariable("idCompany") Long idCompany) throws Exception{
        companyService.deleteCompanyById(idCompany);
        return (ResponseEntity<Company>) ResponseEntity.ok();
    }
}