package animals;

import java.time.LocalDate;

public class Pike extends Animal {
    public Pike(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " пока еще бегать не умеет...");
    }
    @Override
    public void fly() {
        System.out.println(getType() + " летать тоже не умеет... пока что...");
    }
    @Override
    public void swim() {
        System.out.println(getType() + " очень быстро плывет!!!...");
    }
}
