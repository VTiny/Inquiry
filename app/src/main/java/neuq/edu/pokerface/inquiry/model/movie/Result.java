package neuq.edu.pokerface.inquiry.model.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class Result {

    @Expose
    private String movieid;
    @Expose
    private String rating;
    @Expose
    private String genres;
    @Expose
    private String runtime;
    @Expose
    private String language;
    @Expose
    private String title;
    @Expose
    private String poster;
    @Expose
    private String writers;
    @SerializedName("film_locations")
    @Expose
    private String filmLocations;
    @Expose
    private String directors;
    @SerializedName("rating_count")
    @Expose
    private String ratingCount;
    @Expose
    private String actors;
    @SerializedName("plot_simple")
    @Expose
    private String plotSimple;
    @Expose
    private String year;
    @Expose
    private String country;
    @Expose
    private String type;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("also_known_as")
    @Expose
    private String alsoKnownAs;

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getFilmLocations() {
        return filmLocations;
    }

    public void setFilmLocations(String filmLocations) {
        this.filmLocations = filmLocations;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlotSimple() {
        return plotSimple;
    }

    public void setPlotSimple(String plotSimple) {
        this.plotSimple = plotSimple;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(String alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }
}
