package generics.the_solution;

public interface DuoUtility {
    static void printUpper(Duo<String> d){
        System.out.println(d.getFirst().toUpperCase() + "," +
                d.getSecond().toUpperCase());
    }


}
