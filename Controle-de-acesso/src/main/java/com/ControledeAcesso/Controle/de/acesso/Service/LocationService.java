package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.Location;
import com.ControledeAcesso.Controle.de.acesso.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
            this.locationRepository = locationRepository;
        }

    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    public List<Location> findAll(){
            return locationRepository.findAll();
        }


    public Optional<Location> getById(Long idLocation) {
        return locationRepository.findById(idLocation);
    }

    public Location updateLocation(Location location){
            return locationRepository.save(location);
        }

    public void deleteLocationById(Long idLocation) {
        locationRepository.deleteById(idLocation);
    }
}
