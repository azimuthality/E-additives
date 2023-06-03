package com.example.eadditives.entity;

import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "danger")
@NoArgsConstructor
public class Danger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    public Danger(String name) {

        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
