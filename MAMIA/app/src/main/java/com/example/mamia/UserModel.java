package com.example.mamia;

public class UserModel {
    private int id;
    private String age;
    private String race;
    private String ethnicity;
    private String lmp;

    // constructor
    public UserModel(int id, String age, String race, String ethnicity, String lmp) {
        this.id = id;
        this.age = age;
        this.race = race;
        this.ethnicity = ethnicity;
        this.lmp = lmp;
    }

    // toString


    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", age=" + age +
                ", race='" + race + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", lmp='" + lmp + '\'' +
                '}';
    }

    // getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getLmp() {
        return lmp;
    }

    public void setLmp(String lmp) {
        this.lmp = lmp;
    }
}
