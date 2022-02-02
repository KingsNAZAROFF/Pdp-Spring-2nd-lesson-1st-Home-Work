package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Input;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.InputProjection;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
    @RestResource(path = "byFactureNumber")
    public Input findByFactureNumber(@Param("factureNumber") String factureNumber);

}
