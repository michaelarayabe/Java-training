package learning.stream.demo_2;

import java.util.stream.Stream;

public class PersonApp {

    public static void main(String[] args) {

        Person p1 = new Person("Jean", "achternaam", "geslacht", 5, 100, 200);
        Person p2 = new Person("Jean pierre", "achternaam", "geslacht", 2, 333, 444);
        Person p3 = new Person("Jean luc", "achternaam", "geslacht", 4, 100, 222);

        Person[] personArray = new Person[]{p1,p2, p3};

        Stream.of(personArray).map(e -> e.getVoorNaam() + " " + e.getAchterNaam())
                              .forEach(System.out::println);

        double gemiddeldeLeeftijd = Stream.of(personArray)
                .mapToInt(e ->e.getLeefTijd()).average().getAsDouble();

       // System.out.println(gemiddeldeLeeftijd);

        Stream.of(personArray)
                .forEach(e -> {
                    String s = "Person name: " + e.getVoorNaam();
                    System.out.println(s);
                });

    }
}
