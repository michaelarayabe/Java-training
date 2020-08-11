package exercises.practise;

public class Fib {

    public static void main(String[] args) {

        System.out.println(fibonacci(1));

    }

    public static Integer fibonacci(Integer n){

        if(n == 1){
            return 1;
        } else if (n == 0){
            return 0;
        } else{
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
}
