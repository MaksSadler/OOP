package animals;

import java.time.LocalDate;

public class Hyena extends Animal {
    public Hyena(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " бежит очень быстро...");
    }
    @Override
    public void fly() {
        System.out.println(getType() + " летать не умеет...");
    }
    @Override
    public void swim() {
        System.out.println(getType() + " кое-как плавает...");
    }
}
