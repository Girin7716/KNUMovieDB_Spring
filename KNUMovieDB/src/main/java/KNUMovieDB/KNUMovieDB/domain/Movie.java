package KNUMovieDB.KNUMovieDB.domain;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
public class Movie {

    @Id
    @Column(name = "movie_tconst")
    @GeneratedValue
    private String tconst;

    @NotEmpty
    private String title;

    @Column(name = "movie_type")
    private Movie_Type type;

    private String runtime;
    private String start_year;
    private String end_year;
    private boolean isadult;


//    Tconst VARCHAR(15) NOT NULL,
//    Title VARCHAR(200) NOT NULL,
//    Type VARCHAR(20),
//    Runtime NUMERIC,
//    Start_year DATE,
//    End_year DATE,
//    IsAdult NUMERIC,
//    PRIMARY KEY (Tconst)

}
