package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Currency;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.CurrencyProject;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CurrencyProject.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean existsByName(String name);
}
