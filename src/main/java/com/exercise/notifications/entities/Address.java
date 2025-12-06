package com.exercise.notifications.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "adresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(nullable = false, name = "street")
    private String street;

    @Column(nullable = false, name = "city")
    private String city;

    @Column(nullable = false, name = "state")
    private String state;
    @Column(nullable = false, name = "zip")
    private String zip;

    @ManyToOne
    @JoinColumn(name="userd_id")
    private User user;


}
