package br.com.alura.models;

public class Audio {
    private String title;
    private int durationMinutes;
    private int totalPlays;
    private int totalLikes;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void play(){
        this.totalPlays++;
    }

    public void like(){
        this.totalLikes++;
    }


}
