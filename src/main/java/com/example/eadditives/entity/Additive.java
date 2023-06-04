package com.example.eadditives.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "additives")
@NoArgsConstructor
public class Additive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "name_eng")
    private String engName;
    @Column(name = "risk")
    private String risk;
    @Column(name = "description")
    private String description;


    @ManyToMany
    @JoinTable(
            name = "additive_group",
            joinColumns = @JoinColumn(name = "additive_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    Set<Group> groupLikes;

    public Additive(String code, String name, String engName, String description, String risk) {
        this.code = code;
        this.name = name;
        this.engName = engName;
        this.description = description;
        this.risk = risk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEng_name(String engName) {
        this.engName = engName;

    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

