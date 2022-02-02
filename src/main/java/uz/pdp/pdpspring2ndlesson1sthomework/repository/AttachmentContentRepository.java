package uz.pdp.pdpspring2ndlesson1sthomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.AttachmentContent;
import uz.pdp.pdpspring2ndlesson1sthomework.payload.AttachmentContentProject;

@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "list",excerptProjection = AttachmentContentProject.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
    AttachmentContent findByAttachmentId(Integer attachment_id);
}
