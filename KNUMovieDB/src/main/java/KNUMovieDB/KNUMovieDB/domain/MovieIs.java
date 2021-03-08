package KNUMovieDB.KNUMovieDB.domain;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
Movie와 Genre
 */
public class MovieIs {

//    @Id
//    private String parentTconst;
    @Id
    @ManyToOne(targetEntity = Movie.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTconst")
    private Movie movie;

    @Id
    @ManyToOne(targetEntity = Genre_Type.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "parentGenreType")
    private Genre_Type parentGenreType;

//    ParentTconst VARCHAR(15),
//    ParentGenreType VARCHAR(15),
//    PRIMARY KEY (ParentTconst,ParentGenreType)
//ALTER TABLE MOVIEIS ADD FOREIGN KEY(Par   entTconst) REFERENCES MOVIE (Tconst) ON DELETE CASCADE;
}
