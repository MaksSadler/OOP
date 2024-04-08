package animals;

import java.time.LocalDate;

public class Pigeon extends Animal {
    public Pigeon(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " такой себе бегун...");
    }
    @Override
    public void swim() {
        System.out.println(getType() + " не умеет плавать(...");
    }
}
