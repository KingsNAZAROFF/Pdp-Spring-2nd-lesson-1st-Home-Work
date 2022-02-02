package uz.pdp.pdpspring2ndlesson1sthomework.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.pdpspring2ndlesson1sthomework.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbsEntity {
}
