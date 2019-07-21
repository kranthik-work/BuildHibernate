package com.kkalletla.hibernate;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;


@Entity
@Table(name = "MainUser")
public class MainUser {

    private int id;
    private String name;
    private ProteinData proteinData;

    public MainUser() {

    }

    public MainUser(int id, String name, ProteinData proteinData) {
        this.id = id;
        this.name = name;
        this.proteinData = proteinData;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "NAME", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Embedded
    public ProteinData getProteinData() {
        return proteinData;
    }

    public void setProteinData(ProteinData proteinData) {
        this.proteinData = proteinData;
    }

    @Override
    public String toString() {
        return "MainUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proteinData=" + proteinData +
                '}';
    }
}
