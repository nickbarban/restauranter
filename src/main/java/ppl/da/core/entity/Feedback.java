package ppl.da.core.entity;

import javax.persistence.*;

/**
 * Created by greg on 18.10.15.
 */
@Entity
@Table(name = "rest_feedback")
@AttributeOverride(name = "id", column = @Column(name = "feedback_id",
        nullable = false))
public class Feedback extends BaseEntityAudit{
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="restaurant")
    private Restaurant restaurant;
    @Column(name = "text")
    private String text;
    @Column(name = "mark_cuisine")
    private int markCuisine;
    @Column(name = "mark_appartment")
    private int markAppartment;
    @Column(name = "mark_service")
    private int markService;
    @Column(name = "mark")
    private int mark;


    public Feedback() {
    }

    public int getMarkCuisine() {
        return markCuisine;
    }

    public void setMarkCuisine(int markCuisine) {
        this.markCuisine = markCuisine;
    }

    public int getMarkAppartment() {
        return markAppartment;
    }

    public void setMarkAppartment(int markAppartment) {
        this.markAppartment = markAppartment;
    }

    public int getMarkService() {
        return markService;
    }

    public void setMarkService(int markService) {
        this.markService = markService;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
