package Spells;

public class ExpandingSpell extends Spell {

    public ExpandingSpell(String title, String effect, boolean status) {
        super(title, effect, status);
    }

    public void doMagic() {
        System.out.println("A expanding spell was cast");
    }
}