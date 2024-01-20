package com.Streamer.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Film {
    @Id
    private int id;
    @Column(name="TITLE")
    private String title;
    @Column(name="YEAR")
    private int year;
    @Column(name="DIRECTOR")
    private String director;
    @Column(name="BOXOFFICE")
    private int boxoffice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getBoxoffice() {
        return boxoffice;
    }

    public void setBoxoffice(int boxoffice) {
        this.boxoffice = boxoffice;
    }
}

