package com.ControledeAcesso.Controle.de.acesso.Repository;

import com.ControledeAcesso.Controle.de.acesso.Model.AnnualLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnualLeaveRepository extends JpaRepository<AnnualLeave, Long> {
}