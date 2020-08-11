package exercises.practise;

public class Ffib {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int x = a + b;

        System.out.print(a + " " + b + " ");
        while (x < 100){

             x = a + b;
             a = b;
             b = x;
             System.out.print(x + " ");
             x--;
        }

    }
}
