package uz.pdp.pdpspring2ndlesson1sthomework.payload;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProject {
    Integer getId();
    String getName();
}
