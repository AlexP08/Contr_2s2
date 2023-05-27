package com.example.contr_2s2.Controllers;

import com.example.contr_2s2.Serices.MovieService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import com.example.contr_2s2.Models.Movie;


/**
 * Контроллер городов
 */
@RestController
public class MovieController {



    /**
     * Контроллер GET запроса по ссылке "/movies"
     * для получения информации о всех фильмах
     * @param pageable параметр заглушка
     * @return возвращает страницу со всеми фильмами из базы данных
     */
    @GetMapping("/movies")
    public Page<Movie> getAllCities(Pageable pageable){
        return (Page<Movie>) MovieService.getAll(pageable);
    }

    /**
     * Контроллер GET запроса по ссылке "/movies/{name}"
     * для полученя информации фильме по его названию
     *
     * @param name название фильма
     * @return возвращает класс города по заданному имени
     */
    @GetMapping("/movies/{name}")
    public String getMovieByName(@PathVariable String name) {
        return MovieService.getMovieByName(name);
    }

    /**
     * Контроллер POST запроса по ссылке "/movies"
     * для добавления нового фильма в базу данных
     * @param movie JSON данные о городе
     * @return возвращает сохраненный класс города
     */
    @PostMapping("/movies")
    public Movie addMovie(@Valid @RequestBody Movie movie) {
        return MovieService.save(movie);
    }

    /**
     * Контроллер PUT запроса по ссылке "movies/{movieId}"
     * для изменения информации о фильме
     *
     * @param movieId параметр id фильма
     * @param movie  JSON новые данные о фильме
     * @return возвращает измененный класс фильма
     */
    @PutMapping("/movies/{movieId}")
    public Long updateMovie(@Valid @PathVariable Long movieId,
                           @Valid @RequestBody Movie movie) {
        return MovieService.update(movieId, movie);
    }

    /**
     * Контроллер DELETE запроса по ссылке "movies/{movieId}"
     * для удаления фильма из базы данных
     *
     * @param movieId параметр id фильма
     * @return возвращает код статуса
     */
    @DeleteMapping("/movies/{movieId}")
    public Long deleteMovie(@Valid @PathVariable Long movieId) {
        return MovieService.delete(movieId);
    }
}
