package com.ControledeAcesso.Controle.de.acesso.Repository;

import com.ControledeAcesso.Controle.de.acesso.Model.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccurrenceRepository extends JpaRepository<Occurrence, Long> {
}
