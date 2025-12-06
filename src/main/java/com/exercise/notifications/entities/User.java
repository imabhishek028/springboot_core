package com.exercise.notifications.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Setter
@Getter
@AllArgsConstructor // intialse constructor autmoatically
@NoArgsConstructor
@Builder// fix error for above annotation
@Entity // for jakarta // helps
@Table(name = "users") // Hibernate ORM
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "password")
    private String password;

    @OneToMany(mappedBy ="user")
    @Builder.Default // otherise we get null pointer exception when using builder
    private List<Address> addresses = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name="user_tags",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns= @JoinColumn(name= "tag_id")
    )
    @Builder.Default
    private Set<Tags> tags= new HashSet<>();

    public void addAddress(Address address) {
        addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
        address.setUser(null);
    }

    public void addTag(Tags tag) {
        tags.add(tag);
        tag.getUsers().add(this); // because users is set hashmap there
    }

    @OneToOne(mappedBy = "user")
    private Profile profile=new Profile();
}
