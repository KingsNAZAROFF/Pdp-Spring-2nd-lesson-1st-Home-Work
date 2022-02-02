package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierProject {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
