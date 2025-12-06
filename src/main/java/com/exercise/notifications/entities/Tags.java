package com.exercise.notifications.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Setter
@NoArgsConstructor
@Table(name = "tags")
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<User> users= new HashSet<>();

    public Tags(String name) {
        this.name = name;
    }
}
