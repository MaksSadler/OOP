package Animals;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " бежит...");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " летать не умеет...");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " плывет неплохо...");
    }
}
