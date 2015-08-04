package com.ajasuja.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ajasuja on 8/4/15.
 */
public class Crime {
    private UUID crimeId;
    private String crimeTitle;
    private Date date;
    private boolean isSolved;

    public Crime() {
        this.crimeId = UUID.randomUUID();
        this.date = new Date();
    }

    public UUID getCrimeId() {
        return crimeId;
    }

    public String getCrimeTitle() {
        return crimeTitle;
    }

    public void setCrimeTitle(String crimeTitle) {
        this.crimeTitle = crimeTitle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }
}
