package com.example.contr_2s2.Models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * Сущность фильм
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {

    /**
     * Поле Id сущности
     */
    @Id
    @GeneratedValue(generator = "movie_generator")
    @SequenceGenerator(
            name = "movie_generator",
            sequenceName = "movie_sequence",
            initialValue = 100000
    )
    private Long id;

    /**
     * Поле названия фильма
     */
    @Column(columnDefinition = "text", unique = true)
    private String name;

    /**
     * Поле жанр фильма
     */
    @Column(columnDefinition = "text")
    private String genre;

    /**
     * Поле длительности фильма
     */
    @Column(columnDefinition = "int")
    private int Duration;


    /**
     * Поле длительности фильма
     */
    @Column(columnDefinition = "int")
    private int relYear;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
