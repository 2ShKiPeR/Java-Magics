package beast;

import java.util.ArrayList;

public class Student {
    private String name;
    private String facultet;
    private int age;
    private String[] skills = new StringABC

    public Student(String name, String facultet, int age) {
        this.name = name;
        this.facultet = facultet;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFacultet() {
        return facultet;
    }

    public int getAge() {
        return age;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}


