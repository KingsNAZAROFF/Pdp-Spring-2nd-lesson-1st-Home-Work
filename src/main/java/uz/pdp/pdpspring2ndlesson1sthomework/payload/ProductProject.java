package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Attachment;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Category;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Measurement;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Product;

@Projection(types = Product.class)
public interface ProductProject {
    Integer getId();
    String getName();
    Category getCategory();
    Attachment getPhoto();
    String getCode();
    Measurement getMeasurement();
}
