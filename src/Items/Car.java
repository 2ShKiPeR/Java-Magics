package Items;

import beast.Student;

public class Car implements Invisible {
    private Student driver;
    private int speed;
    private boolean is_flying;

    public Car(Student driver, int speed, boolean is_flying) {
        this.driver = driver;
        this.speed = speed;
        this.is_flying = is_flying;
    }

    public void becomeInvisible() {
        if (is_flying == true) {
            System.out.println("The car is now invisible");
        }
    }

    public void becomeVisible() {
        if (is_flying == false) {
            System.out.println("The car is now visible");
        }
    }
}
