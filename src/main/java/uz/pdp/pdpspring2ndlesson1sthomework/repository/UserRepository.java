package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.User;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.UserProject;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = UserProject.class)
public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);

    @RestResource(path = "byName")
    public User findByFirstName(@Param("firstName") String firstName);

    @RestResource(path = "byPhoneNumber")
    public User findByPhoneNumber(@Param("phoneNumber") String firstName);
}
