package mk.ukim.finki.devops_project.service;


import mk.ukim.finki.devops_project.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

     List<Manufacturer> findAll();
     Optional<Manufacturer>save(String name, String country,String address);
}
