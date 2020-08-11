package learning.lambda.demo_7;

import java.util.function.Predicate;

public class BorderControlAgent {

    public boolean handleEntry(Predicate<Person> condition, Person person){

        if(condition.test(person)){
            System.out.println("welcome Artovia");
            return true;
        }else{
            System.out.println("no entry for you");
            return false;
        }

    }
}
