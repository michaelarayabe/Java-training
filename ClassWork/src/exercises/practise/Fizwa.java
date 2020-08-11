package exercises.practise;

public class Fizwa {

    public static void main(String[] args) {

        System.out.println(fizzBuzz(29));
    }

    public static String fizzBuzz(Integer i){

        String result = "";

        if(i % 3 == 0){
            result += "Fizz";
        }

        if(i % 5 == 0){
            result += "Buzz";
        }
        if(result.equals("")){
            result = i.toString();
        }

        return result;
    }
}
