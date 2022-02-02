package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Input;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.InputProduct;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Projection(types = InputProduct.class)
public interface inputProductProjection {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();
    Date getExpireDate();

    Input getInput();
}
