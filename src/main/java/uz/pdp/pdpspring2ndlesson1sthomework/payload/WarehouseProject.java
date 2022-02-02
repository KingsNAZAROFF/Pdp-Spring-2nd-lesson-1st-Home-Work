package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseProject {
    Integer getId();
    String getName();
}
