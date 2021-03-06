package com.example.beans;

/**
 * Created by p998snc on 2016.02.10.
 */
public class Peanut implements Comparable{

    long id;
    String name;

    public Peanut(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Peanut peanut = (Peanut) o;
        return this.name.compareTo(peanut.name);
    }
}
