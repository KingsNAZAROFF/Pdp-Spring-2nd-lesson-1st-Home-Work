package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Output;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.OutPutProject;

@RepositoryRestResource(path = "outPut",collectionResourceRel = "list",excerptProjection = OutPutProject.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {

    @RestResource(path = "byFactureNumber")
    public Output findByFactureNumber(@Param("factureNumber") String factureNumber);
}
