package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.abs(duration);
    }

    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getPlayingTime(){
        return String.valueOf(getDuration());
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    @Override
    public String toString() {
        if (releaseDate != null)
            return super.getTitle() + " " + releaseDate.getYear();
        else
            return super.getTitle();
    }

    public static void main(String[] args) {
        Movie marvel = new Movie("iron-man", Rating.MATURE);
        Content dc = new Movie("batman", Rating.MATURE);
        marvel.setDirector("Steven");
        System.out.println(marvel.getDirector() + " , " + marvel.getTitle());
    }

}
