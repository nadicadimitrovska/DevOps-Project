package mk.ukim.finki.devops_project.repository.jpa;

import mk.ukim.finki.devops_project.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepositoryDB extends JpaRepository<Manufacturer,Long> {
}
