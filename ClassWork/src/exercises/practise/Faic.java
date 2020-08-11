package exercises.practise;

public class Faic {

    public static void main(String[] args) {
        System.out.println(fib(4));


    }

    //1, 1, 2, 3, 5, 8

    public static Integer fib(Integer i){

        if(i == 1) return 1;
        if(i == 2) return 1;

        int a = 0;
        int b = 1;
        int sum = a + b;

        while(i > 1){

            sum = a + b;
            a = b;
            b = sum;

            i--;
        }

        return sum;
    }


}

