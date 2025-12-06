package com.exercise.notifications.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Entity
@Setter
@Table(name = "profiles")
@NoArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bio")
    private String bio;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name="date_of_birth")
    private LocalDate date_of_birth;
    @Column(name = "loyalty_points")
    private String loyalty_points;

    @OneToOne
    @JoinColumn( name="id")
    @MapsId// profile is owner of this relatiojnship
    private User user;

    public Profile(String  bio) {
        this.bio=bio;
    }

}
