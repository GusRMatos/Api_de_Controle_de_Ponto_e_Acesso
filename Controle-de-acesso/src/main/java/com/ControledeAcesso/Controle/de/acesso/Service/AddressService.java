package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.Address;
import com.ControledeAcesso.Controle.de.acesso.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Optional<Address> getById(Long idAddress) {
        return addressRepository.findById(idAddress);
    }

    public Address updateAddress(Address address){
        return addressRepository.save(address);
    }

    public void deleteAddressById(Long idAddress) {
        addressRepository.deleteById(idAddress);
    }
}

