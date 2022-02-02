package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Client;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.ClientProject;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = ClientProject.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
