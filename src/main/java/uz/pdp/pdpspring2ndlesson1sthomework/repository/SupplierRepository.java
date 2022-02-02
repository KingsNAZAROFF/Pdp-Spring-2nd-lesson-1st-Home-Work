package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Supplier;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.SupplierProject;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = SupplierProject.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
    @RestResource(path = "byName")
    public Supplier findByName(@Param("name") String name);
    @RestResource(path = "byPhoneNumber")
    public Supplier findByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
