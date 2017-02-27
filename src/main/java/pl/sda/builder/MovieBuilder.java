package pl.sda.builder;

import java.time.LocalDate;

/**
 * Created by m.losK on 2017-02-25.
 */
public class MovieBuilder {
    private Movie movie;

    public MovieBuilder() {
        this.movie = new Movie();
    }

    public MovieBuilder withTitle(String title) {
        this.movie.setTitle(title);
        return this;
    }

    public MovieBuilder withDirector(String director) {
        this.movie.setDirector(director);
        return this;
    }

    public MovieBuilder withReleaseDate(LocalDate releaseDate) {
        this.movie.setReleaseDate(releaseDate);
        return this;
    }

    public Movie build() {
        return movie;
    }
}
