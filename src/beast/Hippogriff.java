package beast;


import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private boolean fire_breathing;

    public Hippogriff(String name, int age, String color, boolean fire_breathing) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.fire_breathing = fire_breathing;
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff(){
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean getFire_breathing(){
        return fire_breathing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat(String food) {
        return food;
    }

    public String fly(String name, int age) {
        return  age > 2 ? this.name + "can flying" : this.name + "he is very small, can`t flying";
    }

    public void giveRide(Student student) {
        int isGivingRide = new Random().nextInt(1, 10);
        if (1 <= isGivingRide && isGivingRide <= 3) {
            System.out.println(student.getName() + "летит на Гиппогрифе");
        }
        if (4 <= isGivingRide && isGivingRide <= 8) {
            System.out.println("Гиппогриф смотрит свысока");
        }
        if (isGivingRide == 9 || isGivingRide == 10) {
            System.out.println("Попробуйте снова");
        }
    }
}
