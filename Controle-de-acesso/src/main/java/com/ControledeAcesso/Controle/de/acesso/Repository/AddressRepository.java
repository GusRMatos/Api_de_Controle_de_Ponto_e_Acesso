package com.ControledeAcesso.Controle.de.acesso.Repository;

import com.ControledeAcesso.Controle.de.acesso.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
