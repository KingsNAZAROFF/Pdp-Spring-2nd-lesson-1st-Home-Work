package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyProject {
    Integer getId();
    String getName();
}
