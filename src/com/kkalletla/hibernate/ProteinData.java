package com.kkalletla.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;


@Embeddable
public class ProteinData {

    private int total;
    private int goal;

    public ProteinData() {

    }

    public ProteinData(int total, int goal) {
        this.total = total;
        this.goal = goal;
    }

    @Column(name = "TOTAL", nullable = false)
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Column(name = "GOAL", nullable = false)
    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "ProteinData{" +
                "total=" + total +
                ", goal=" + goal +
                '}';
    }
}
