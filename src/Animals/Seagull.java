package Animals;

import java.time.LocalDate;

public class Seagull extends Animal {
    public Seagull(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " такая себе бегунья...");
    }
    @Override
    public void swim() {
        System.out.println(getType() + " плохо плавает(...");
    }
}
