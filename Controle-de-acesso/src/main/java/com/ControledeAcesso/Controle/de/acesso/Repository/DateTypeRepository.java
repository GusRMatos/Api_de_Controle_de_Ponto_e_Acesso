package com.ControledeAcesso.Controle.de.acesso.Repository;

import com.ControledeAcesso.Controle.de.acesso.Model.DateType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateTypeRepository extends JpaRepository<DateType, Long> {
}
