package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.Location;
import com.ControledeAcesso.Controle.de.acesso.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Location")
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping
    public Location createLocation(@RequestBody Location location){
        return locationService.saveLocation(location);
    }

    @GetMapping
    public List<Location> getLocationList(){
        return locationService.findAll();
    }

    @GetMapping("/{idLocation}")
    public ResponseEntity<Location> getLocationById(@PathVariable("idLocation") Long idLocation) throws Exception{
        return ResponseEntity.ok(locationService.getById(idLocation).orElseThrow(() ->
                new NoSuchElementException("Location not found")));
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationService.updateLocation(location);
    }

    @DeleteMapping("/{idLocation}")
    public ResponseEntity<Location>deleteLocationById(@PathVariable("idLocation") Long idLocation) throws Exception{
        locationService.deleteLocationById(idLocation);
        return (ResponseEntity<Location>) ResponseEntity.ok();
    }
}
