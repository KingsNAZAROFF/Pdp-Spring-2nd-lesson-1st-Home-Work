package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Client;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Currency;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Output;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutPutProject {
    Integer getId();
    Timestamp getDate();
    Client getClient();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
