package com.example.gebruiker.inspectorgadget.database;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Entity mapped to table "CRIME".
 */
public class Crime {

    private Long id;
    private String title;
    private java.util.Date date;
    private Boolean solved;
    private String suspect;
    private String picturePath;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END


    public Crime(Long id, String title, java.util.Date date, Boolean solved, String suspect, String picturePath) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.solved = solved;
        this.suspect = suspect;
        this.picturePath = picturePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public Boolean getSolved() {
        return solved;
    }

    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    public String getSuspect() {
        return suspect;
    }

    public void setSuspect(String suspect) {
        this.suspect = suspect;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    // KEEP METHODS - put your custom methods here
    public String getPhotoFilename() {
        return "IMG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".jpg";
    }

    public Crime() {
        date=new Date();
        solved=false;
    }

    public Crime(Long id) {
        this.id = id;
        date=new Date();
        solved=false;
    }
    // KEEP METHODS END

}
