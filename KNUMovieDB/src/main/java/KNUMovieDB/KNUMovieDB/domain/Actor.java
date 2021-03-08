package KNUMovieDB.KNUMovieDB.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Actor {

    @Id
    @Column(name = "actor_id")
    @GeneratedValue
    private String id;

    @Column(name = "actor_name")
    private String name;

    @Column(name = "actor_bdate")
    private String bdate;


//    Actor_id VARCHAR(10),
//    Name VARCHAR(50),
//    Bdate VARCHAR(5),
//    PRIMARY KEY(Actor_id)
}
