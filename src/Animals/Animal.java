package Animals;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, LocalDate birthDay, Illness illness) {
        this.name = name;
        this.birthDay = birthDay;
        this.illness = illness;
    }

    public Animal() {
        this("Барсик",LocalDate.now(), new Illness("Болезнь"));
    }

    private void wakeUp() {
        System.out.println(getType() + " проснулся(.)(.)");
    }
    private void hunt() {
        System.out.println(getType() + " охотится.");
    }
    private void eat() {
        System.out.println(getType() + " кушает.");
    }
    private void sleep() {
        System.out.println(getType() + " спит(_)(_)");
    }
    private void wakeUp(String time) {
        System.out.println(getType() + " проснулся(.)(.) в " + time);
    }
    public void lifeCycle() {
        wakeUp();
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }
    public void toGo() {
        System.out.println(getType() + " бежит...");
    }
    public void fly() {
        System.out.println(getType() + " летит...");
    }
    public void swim() {
        System.out.println(getType() + " плывет...");
    }
    public String getName() {
        return name;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType() {
        return getClass().getSimpleName();
    }
    @Override
    public String toString() {
        return String.format("name = %s birthDay = %s illness = %s", name,birthDay,illness);
    }

}
