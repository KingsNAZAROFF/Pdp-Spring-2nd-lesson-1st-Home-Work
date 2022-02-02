package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Output;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.OutputProduct;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Product;

@Projection(types = OutputProduct.class)
public interface OutPutProductProject {

    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Output getOutput();
}
