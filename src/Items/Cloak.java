package Items;

public class Cloak implements Invisible {
    private int capacity;
    private int weight;

    public Cloak(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public void becomeInvisible() {
        if (capacity <= 3 && weight <= 240) {
            System.out.println("The people under the cloak are invisible right now.");
        }
    }

    public void becomeVisible() {
        if (capacity >= 4 && weight > 240) {
            System.out.println("The people under the cloak are visible right now.");
        }
    }
}
