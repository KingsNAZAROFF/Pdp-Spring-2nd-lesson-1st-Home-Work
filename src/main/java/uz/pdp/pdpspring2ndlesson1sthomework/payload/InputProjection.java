package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Currency;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Input;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Supplier;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputProjection {

    Integer getId();
    Timestamp getDate();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
