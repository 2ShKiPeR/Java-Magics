package Spells;

public abstract class Spell {
    private String title;
    private String effect;
    private boolean status;

    public Spell(String title, String effect, boolean status) {
        this.title = title;
        this.effect = effect;
        this.status = status;
    }

    public abstract void doMagic();

    public String getTitle() { return title; }
    public String getEffect() { return effect; }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
