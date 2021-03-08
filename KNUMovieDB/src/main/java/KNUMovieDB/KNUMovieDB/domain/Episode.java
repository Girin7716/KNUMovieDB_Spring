package KNUMovieDB.KNUMovieDB.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Episode {

    @Id @GeneratedValue
    @Column(name = "episode_tconst")
    private String tconst;

//    @ManyToOne
//    @JoinColumn(name = "movie_tconst")
//    private String parentTconst;

    @ManyToOne(targetEntity = Movie.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTconst")
    private Movie movie;

    private Long seasonNumber;
    private Long episodeNumber;
//    Tconst VARCHAR(15) NOT NULL,
//    ParentTconst VARCHAR(15),
//    SeasonNumber NUMERIC,
//    EpisodeNumber NUMERIC,
//    PRIMARY KEY (Tconst)

//    ALTER TABLE EPISODE ADD FOREIGN KEY(ParentTconst) REFERENCES MOVIE (Tconst) ON DELETE CASCADE;
//

}
