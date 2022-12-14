package personal.training.models;

import personal.training.models.Course;
import personal.training.models.Gender;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;

    private final int age;

    private final Gender gender;

    private final boolean active;

    private final List<Course> courses;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isActive() {
        return active;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public Student(String name, int age, Gender gender, boolean active, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.active = active;
        this.courses = courses;
    }



}
