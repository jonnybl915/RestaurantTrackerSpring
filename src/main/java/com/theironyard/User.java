package com.theironyard;

import javax.persistence.*;

/**
 * Created by jonathandavidblack on 6/21/16.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue //auto-generates id
    int id;

    @Column(nullable = false) //requires that name NOT be null
    String name;

    @Column(nullable = false) //requires that password NOT be null
    String password;

    public User(String name, String password) { //don't need the id in the constructor bc the database will generate and store id
        this.name = name;
        this.password = password;
    }
}
