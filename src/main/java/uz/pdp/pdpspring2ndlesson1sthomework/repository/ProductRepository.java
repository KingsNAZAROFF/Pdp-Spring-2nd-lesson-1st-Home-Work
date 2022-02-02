package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Product;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.ProductProject;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = ProductProject.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
    boolean existsByNameAndCategoryId(String name, Integer category_id);
    @RestResource(path = "byName")
    public Product findByName(@Param("name") String name);

    @RestResource(path = "byCategoryId")
    public Page<Product> findAllByCategoryId(@Param("categoryId") Integer categoryId, Pageable pageable);
}
