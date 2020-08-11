package learning.lambda.demo_7;

public class App {

    public static void main(String[] args) {

        BorderControlAgent borderControlAgent = new BorderControlAgent();

        Person p1 = new Person("Jean", 20);
        Person p2 = new Person("Marie", 54);
        Person p3 = new Person("Luc", 51);
        Person p4 = new Person("Jean jean", 10);
        Person p5 = new Person("Jean lu", 18);

        Person[] personArray = new Person[]{p1, p2, p3, p4, p5};

        System.out.println("Day 1:");

        for(Person person : personArray){
            borderControlAgent.handleEntry(e ->e.passport != null, person);
        }

        System.out.println("\nDay2");
        for(Person person : personArray){
            borderControlAgent.handleEntry(e ->e.passport != null && e.passport.isValid, person);
        }

        System.out.println("\nDay3");
        for(Person person : personArray){
            borderControlAgent.handleEntry(e ->e.passport != null && e.age >= 18, person);
        }

    }
}
