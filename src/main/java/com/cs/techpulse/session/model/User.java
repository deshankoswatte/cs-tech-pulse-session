package com.cs.techpulse.session.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "authentication")
    private String authentication;

    public User() {

    }

    public User(String name, String authentication) {

        this.name = name;
        this.authentication = authentication;
    }

    public long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAuthentication() {

        return authentication;
    }

    public void setAuthentication(String authentication) {

        this.authentication = authentication;
    }

    @Override
    public String toString() {

        return "User [id=" + id + ", name=" + name + ", authentication=" + authentication + "]";
    }

}
