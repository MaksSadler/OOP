package Animals;

import java.time.LocalDate;

public class Duck extends Animal{
    private int wingCount;
    public Duck(String name, LocalDate birthDay, Illness illness, int wingCount) {
        super(name, birthDay, illness);
        this.wingCount = wingCount;
    }

    @Override
    public String toString() {
        return String.format("name = %s birthDay = %s illness = %s wingCount = %s",
                name,birthDay,illness,wingCount);
    }

}
