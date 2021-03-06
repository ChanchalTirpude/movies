package com.arshideep.movies.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {
    //MovieId, Movie name, movie language, movie genre, duration.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull private String movieName;
    @NonNull private String movieLanguage;
    private String genre;
    @NonNull private Integer duration;

}
