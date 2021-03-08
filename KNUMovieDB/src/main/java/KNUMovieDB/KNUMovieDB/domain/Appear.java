package KNUMovieDB.KNUMovieDB.domain;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
Movie와 Actor 연결
 */
public class Appear {

//    @Id
//    private String parentActor_id;
    @Id
    @ManyToOne(targetEntity = Actor.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentActor_id")
    private Actor actor;

//    @Id
//    private String parentTconst;
    @Id
    @ManyToOne(targetEntity = Movie.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTconst")
    private Movie movie;


//    ParentActor_id VARCHAR(10),
//    ParentTconst VARCHAR(15),
//    PRIMARY KEY (ParentActor_id,ParentTconst)

//    ALTER TABLE APPEAR ADD FOREIGN KEY(ParentActor_id) REFERENCES ACTOR (Actor_id) ON DELETE CASCADE;
//    ALTER TABLE APPEAR ADD FOREIGN KEY(ParentTconst) REFERENCES MOVIE (Tconst) ON DELETE CASCADE;
}
