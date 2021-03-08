package KNUMovieDB.KNUMovieDB.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Genre {

    @Id
    @Column(name = "genre_type")
    private String type;


//    Genre_Type VARCHAR(15),
//    PRIMARY KEY (Genre_Type)
}
