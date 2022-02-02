package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentProject {
    Integer getId();
    String getName();
    long getSize();
    String getContentType();



}
