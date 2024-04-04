package Animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Мурзик", LocalDate.of(2010,11,23),
                new Illness("Лешай"));
        System.out.println(cat.getName());
        Animal animal = new Animal();

        //cat.setIllness(new Illness(null));
        System.out.println(animal.getName());
        System.out.println(cat.getIllness());

        Dog dog = new Dog("Догмит", LocalDate.of(1990, 1,13),
                new Illness("Чурка"));

        System.out.println(dog.getType());

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Duck("Лера", LocalDate.of(1999,10,15),
                new Illness("Чумка"),2));

        System.out.println(list);

        dog.lifeCycle();

        Seagull seagull = new Seagull("Чайка", LocalDate.of(1990, 1,13),
                new Illness(""));
        Pigeon pigeon = new Pigeon("Голубь", LocalDate.of(1990, 1,13),
                new Illness(""));
        Carp carp = new Carp("Карась", LocalDate.of(1990, 1,13),
                new Illness(""));
        Pike pike = new Pike("Щука", LocalDate.of(1990, 1,13),
                new Illness(""));
        Hog hog = new Hog("Кабан", LocalDate.of(1987, 4,12),
                new Illness(""));
        Hyena hyena = new Hyena("Гиена", LocalDate.of(1987, 4,12),
                new Illness(""));

        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(seagull);
        listAnimals.add(pigeon);
        listAnimals.add(carp);
        listAnimals.add(pike);
        listAnimals.add(hog);
        listAnimals.add(hyena);

        for(Animal a : listAnimals) {
            a.swim();
            a.fly();
            a.toGo();
        }
    }
}