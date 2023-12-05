package mk.ukim.finki.devops_project.repository.impl;

import mk.ukim.finki.devops_project.bootstrap.DataHolder;
import mk.ukim.finki.devops_project.model.Manufacturer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ManufacturerRepository {

    public List<Manufacturer> findAll(){
        return DataHolder.manufacturers;
    }

    public Optional<Manufacturer>findById(Long id){
        return DataHolder.manufacturers.stream().filter(i->i.getId().equals(id)).findFirst();
    }
}
