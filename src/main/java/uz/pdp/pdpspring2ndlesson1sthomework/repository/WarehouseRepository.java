package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Warehouse;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.WarehouseProject;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = WarehouseProject.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
    boolean existsByName(String name);
    @RestResource(path = "byName")
    public Warehouse findByName(@Param("name") String name);
}
