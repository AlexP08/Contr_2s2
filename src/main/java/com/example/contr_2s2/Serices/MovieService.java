package com.example.contr_2s2.Serices;

import com.example.contr_2s2.Models.Movie;
import org.springframework.data.domain.Pageable;

public interface MovieService {

    static Movie save(Movie movie) {
        return movie;
    }

    static Long delete(Long id) {
        return id;
    }

    static Long update(Long id, Movie movie) {
        return id;
    }

    Movie getMovieById(Long id);

    static Pageable getAll(Pageable pageable) {
        return pageable;
    }

    static String getMovieByName(String name) {
        return name;
    }
}
