package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Measurement;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.MeasurementProject;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = MeasurementProject.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
    boolean existsByName(String name);


}
