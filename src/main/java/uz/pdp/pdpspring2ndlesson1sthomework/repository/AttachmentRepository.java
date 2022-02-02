package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Attachment;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.AttachmentProject;

@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentProject.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

}
