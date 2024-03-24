import beast.*;
import Items.*;

public class Main {
    public static void main(String[] args) {

        Hippogriff Dodo = new Hippogriff("Dodo", 18, "White", true);
        Hippogriff Hippo = new Hippogriff("Hippo");
        Hippogriff Dambo = new Hippogriff("Dambo", "Black");
        Hippogriff Nimb = new Hippogriff();
        Nimb.setName("Nimb");
        Student student = new Student("Harry ", "Griffindor", 18);
        Spell spell = new Spell("Bombarda", 3);
        Car Ford = new Car();

        student.getSkills()[0] = "fly on boom";
        Dodo.giveRide(student);
        student.castSpell(spell);
    }
}
