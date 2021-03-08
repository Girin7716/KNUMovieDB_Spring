package KNUMovieDB.KNUMovieDB.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Account {

    @Id
    @Column(name = "account_id")
    private String id;
    private String password;
    private String fname;
    private String lname;
    private String phone_number;
    private String address;
    private String sex;

    @Column(name = "account_bdate")
    private String bdate;

    @Enumerated(EnumType.STRING)
    private Membership membership;

    @Enumerated(EnumType.STRING)
    private Account_Type account_type;

    private String job;


//    Account_ID VARCHAR(10) NOT NULL,
//    Password VARCHAR(20) NOT NULL,
//    Fname VARCHAR(10) NOT NULL,
//    Lname VARCHAR(10) NOT NULL,
//    Phone_number VARCHAR(15) NOT NULL,
//    Address VARCHAR(30),
//    Sex VARCHAR(2),
//    Bdate DATE,
//    Membership VARCHAR(15) DEFAULT 'Basic',
//    Account_type NUMERIC,
//    Job VARCHAR (10),
//    PRIMARY KEY(Account_ID)
}
