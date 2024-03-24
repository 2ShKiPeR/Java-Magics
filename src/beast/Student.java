package beast;

import java.util.ArrayList;

public class Student {
    private String name;
    private String facultet;
    private int age;
    private String[] skills = new String[3];

    public Student(String name, String facultet, int age) {
        this.name = name;
        this.facultet = facultet;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFacultet() { return facultet; }

    public int getAge() {
        return age;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void castSpell(Spell spell) {
        SpellCastException message = new SpellCastException(this.name + " слишком мелкий, чтобы использовать " + spell.getTitle());
        if (this.age == 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw message;
            }
        }
        if (this.age == 12) {
            if (spell.getPower() == 1 || spell.getPower() == 2) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw message;
            }
        }

        if (this.age == 13) {
            if (spell.getPower() == 1 || spell.getPower() == 2 || spell.getPower() == 3) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw message;
            }
        }

        if (this.age == 14) {
            if (spell.getPower() == 1 || spell.getPower() == 2 || spell.getPower() == 3 || spell.getPower() == 4) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw message;
            }
        }

        if (this.age == 15) {
            if (spell.getPower() == 1 || spell.getPower() == 2 || spell.getPower() == 3 || spell.getPower() == 4 || spell.getPower() == 5) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw message;
            }
        }

        if (this.age == 16) {
            if (spell.getPower() == 1 || spell.getPower() == 2 || spell.getPower() == 3 || spell.getPower() == 4 || spell.getPower() == 5 || spell.getPower() == 6) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw message;
            }
        }

        if (this.age >= 17) {
            System.out.println(this.name + " использовал заклинание " + spell.getTitle());
        }
    }

}


