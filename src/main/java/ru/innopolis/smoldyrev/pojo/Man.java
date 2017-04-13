package ru.innopolis.smoldyrev.pojo;

import java.util.Date;

public class Man {

    private Integer number;
    private String name;
    private Date birthdate;
    private Integer height;
    private Integer weight;
    private boolean sex;

    public Man() {
    }

    public Man(Integer number, String name, Date birthdate, Integer height, Integer weight, boolean sex) {
        this.number = number;
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
