package ppl.da.core.entity;

import javax.persistence.*;

/**
 * Created by greg on 18.10.15.
 */
@Entity
@Table(name = "restaurant")
@AttributeOverride(name = "id", column = @Column(name = "restaurant_id",
        nullable = false))
public class Restaurant extends BaseEntityAudit {
    @Column(name = "mark")
    private float mark;
    @Embedded
    private Point point;
    @Column(name = "restaurant_name")
    private String name;

    public Restaurant() {
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
