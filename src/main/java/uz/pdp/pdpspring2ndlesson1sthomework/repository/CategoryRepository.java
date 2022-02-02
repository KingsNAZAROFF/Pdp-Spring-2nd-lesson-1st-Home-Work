package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Category;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.CategoryProject;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CategoryProject.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    boolean existsByName(String name);
}
