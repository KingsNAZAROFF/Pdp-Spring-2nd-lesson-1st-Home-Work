package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.OutputProduct;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.OutPutProductProject;

@RepositoryRestResource(path = "outPutProduct",collectionResourceRel = "list",excerptProjection = OutPutProductProject.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

}
