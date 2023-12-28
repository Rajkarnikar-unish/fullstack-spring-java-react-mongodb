package com.rajkarnikarunish.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    /***
     * Uses repository class to talk to database, get list of movies, and so on
     */

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singelMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
