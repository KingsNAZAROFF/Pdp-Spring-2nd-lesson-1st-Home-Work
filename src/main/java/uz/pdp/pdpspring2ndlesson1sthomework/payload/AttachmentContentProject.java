package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Attachment;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentProject {

    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();


}
