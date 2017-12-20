package be.ap.eaict.gadder.DOM;

import java.util.Calendar;

/**
 * Created by Kevin-Laptop on 20/12/2017.
 */

public class Event {

    private int id;
    private String name;
    private String place;
    private String description;
    private int creator;
    private Calendar startDate;
    private Calendar endDate;



    public Event(int id, String name, String place, String description, int creator, Calendar startDate, Calendar endDate){
        this.id = id;
        this.name = name;
        this.place = place;
        this.description = description;
        this.creator = creator;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }
}