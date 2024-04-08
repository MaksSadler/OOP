package animals;

import java.time.LocalDate;

public class Hog extends Animal {
    public Hog(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " бежит здорово...");
    }
    @Override
    public void fly() {
        System.out.println(getType() + " летать не умеет...");
    }
    @Override
    public void swim() {
        System.out.println(getType() + " такой себе плавец...");
    }
}
