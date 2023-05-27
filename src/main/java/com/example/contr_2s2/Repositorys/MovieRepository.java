package com.example.contr_2s2.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.contr_2s2.Models.Movie;

import java.util.List;

/**
 * Репозиторий фильмов
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByNameEquals(String name);
}
