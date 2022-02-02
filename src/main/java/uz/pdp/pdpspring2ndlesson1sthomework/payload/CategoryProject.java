package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Category;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.template.AbsEntity;

@Projection(types = Category.class)
public interface CategoryProject {
    Integer getId();
    String getName();
    Category getParentCategory();

}
