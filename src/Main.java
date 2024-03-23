import beast.*;


public class Main {
    public static void main(String[] args) {
        Hippogriff Dodo = new Hippogriff("Dodo", 18, "White", true);
        Hippogriff Hippo = new Hippogriff("Hippo");
        Hippogriff Dambo = new Hippogriff("Dambo", "Black");
        Hippogriff Nimb = new Hippogriff();
        Nimb.setName("Nimb");
        Student student = new Student("Harry ", "Griffindor", 18);
        student.getSkills()[0] = "fly on boom";
        System.out.println(Dodo.giveRide(student));
    }
}
