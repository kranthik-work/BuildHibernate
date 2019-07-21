package com.kkalletla.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    /*@Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "Total")
    private int total;

    @Column(name = "Goal")
    private int goal;

    public User() {
    }

    public User(int id, String name, int total, int goal) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.goal = goal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total=" + total +
                ", goal=" + goal +
                '}';
    }*/

    private int id;
    private String name;
    private ProteinData[] proteinData;

    public User() {

    }

    public User(int id, String name, ProteinData[] proteinData) {
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
    public ProteinData[] getProteinData() {
        return proteinData;
    }

    public void setProteinData(ProteinData[] proteinData) {
        this.proteinData = proteinData;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proteinData=" + proteinData +
                '}';
    }
}
