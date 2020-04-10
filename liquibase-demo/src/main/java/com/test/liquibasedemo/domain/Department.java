package com.test.liquibasedemo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "department")
public class Department {

    @GeneratedValue(generator = "uuid")
    @Column(name = "id")
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private boolean isActive;


    @Column(name = "json_Data", columnDefinition = "json")
    private boolean jsonData;
}
