package KNUMovieDB.KNUMovieDB.domain;

import lombok.Getter;
import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@Getter
public class Version {

//    @Id
//    private String parentTconst;

    @Id
    @ManyToOne(targetEntity = Movie.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTconst")
    private Movie movie;

    @Id
    private Long ordering;

    @Column(name = "version_title")
    private String title;

    private String region;
    private String language;
    private Long isOriginalTitle;


//    ParentTconst VARCHAR(15),
//    Ordering NUMERIC,
//    Title VARCHAR(200),
//    Region VARCHAR(7),
//    Language VARCHAR(7),
//    IsOriginalTtile NUMERIC,
//    PRIMARY KEY (ParentTconst, Ordering)

// ALTER TABLE VERSION ADD FOREIGN KEY(ParentTconst) REFERENCES MOVIE (Tconst) ON DELETE CASCADE;
}
