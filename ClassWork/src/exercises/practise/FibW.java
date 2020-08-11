package exercises.practise;

public class FibW {

    // 0, 1, 1, 2, 3, 5

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int a = 0;
        int b = 1;
        int c = a + b;

        while(n > 1){

            c = a + b;
            a = b;
            b = c;

            n--;
        }

        return c;

    }
}
