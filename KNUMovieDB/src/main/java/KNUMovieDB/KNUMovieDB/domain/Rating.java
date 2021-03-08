package KNUMovieDB.KNUMovieDB.domain;

import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
public class Rating {

//    @Id
//    @Column(name = "rating_parentAccount")
//    private String parentAccount;

    @Id
    @ManyToOne(targetEntity = Account.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentAccount")
    private Account account;

    @Id
    @ManyToOne(targetEntity = Movie.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "parentTconst")
    private Movie movie;

//    @Id
//    @Column(name = "rating_parentTconst")
//    private String parentTconst;

    @ColumnDefault("0") //default 0
    private Long rating;

//    ParentAccount VARCHAR(10),
//    ParentTconst VARCHAR(15),
//    Rating DECIMAL(4,2) default 0,
//    PRIMARY KEY (ParentAccount,ParentTconst)

//    ALTER TABLE RATING ADD FOREIGN KEY(ParentAccount) REFERENCES ACCOUNT (Account_ID) ON DELETE CASCADE;
//    ALTER TABLE RATING ADD FOREIGN KEY(ParentTconst) REFERENCES MOVIE (Tconst) ON DELETE CASCADE;
//

}
