package Animals;

import java.time.LocalDate;

public class Carp extends Animal {
    public Carp(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " по земле не ходит...");
    }
    @Override
    public void fly() {
        System.out.println(getType() + " полеты эволюцией не предусмотрены(...");
    }
    @Override
    public void swim() {
        System.out.println(getType() + " здорово плывет!!!!...");
    }
}
