package GeoWithResearch;

import GeoWithResearch.Gender;

public class Person {
    private String fullName;
    private Gender gender;


    public Person(String fullName, Gender gender) {
        this.fullName = fullName;
        this.gender = gender;
    }
    public Person(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "GeoWithResearch.Person{" +
                "gender=" + gender +
                '}';
    }
}