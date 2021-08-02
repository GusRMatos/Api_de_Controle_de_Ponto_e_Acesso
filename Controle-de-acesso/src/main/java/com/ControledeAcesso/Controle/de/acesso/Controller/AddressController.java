package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.Address;
import com.ControledeAcesso.Controle.de.acesso.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping
    public Address createAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping
    public List<Address> getAddressList(){
        return addressService.findAll();
    }

    @GetMapping("/{idAddress}")
    public ResponseEntity<Address> getAddressById(@PathVariable("idAddress") Long idAddress) throws Exception{
        return ResponseEntity.ok(addressService.getById(idAddress).orElseThrow(() ->
                new NoSuchElementException("Address not found")));
    }

    @PutMapping
    public Address updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }

    @DeleteMapping("/{idAddress}")
    public ResponseEntity<Address>deleteAddressById(@PathVariable("idAddress") Long idAddress) throws Exception{
        addressService.deleteAddressById(idAddress);
        return (ResponseEntity<Address>) ResponseEntity.ok();
    }
}