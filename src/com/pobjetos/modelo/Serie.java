package com.pobjetos.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Serie {
    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;
    private int sesionQuantity;
    private Chapter chapeter;

    public Serie() {
    }

    public Serie(String title, String genre, String creator, int duration, short year, Chapter chapeter) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.chapeter = chapeter;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean isViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the timeViewed
     */
    public int getTimeViewed() {
        return timeViewed;
    }

    /**
     * @param timeViewed the timeViewed to set
     */
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    /**
     * @return the sesionQuantity
     */
    public int getSesionQuantity() {
        return sesionQuantity;
    }

    /**
     * @param sesionQuantity the sesionQuantity to set
     */
    public void setSesionQuantity(int sesionQuantity) {
        this.sesionQuantity = sesionQuantity;
    }

    /**
     * @return the chapeter
     */
    public Chapter getChapeter() {
        return chapeter;
    }

    /**
     * @param chapeter the chapeter to set
     */
    public void setChapeter(Chapter chapeter) {
        this.chapeter = chapeter;
    }
    
}
