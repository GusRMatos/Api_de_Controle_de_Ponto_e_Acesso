package com.ControledeAcesso.Controle.de.acesso.Repository;

import com.ControledeAcesso.Controle.de.acesso.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
}
