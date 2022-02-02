package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Client;

@Projection(types = Client.class)
public interface ClientProject {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
