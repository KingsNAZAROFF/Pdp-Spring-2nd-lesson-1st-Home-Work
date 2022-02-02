package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.InputProduct;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.inputProductProjection;

@RepositoryRestResource(path = "inputProduct",collectionResourceRel = "list",excerptProjection = inputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
