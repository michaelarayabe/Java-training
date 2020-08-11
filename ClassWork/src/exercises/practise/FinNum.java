package exercises.practise;

public class FinNum {

    public static void main(String[] args) {

        System.out.println(fibonnacci(2));
    }

    public static Integer fibonnacci(Integer n){

        if(n == 1){
            return 1;
        } else if(n == 0){
            return 0;
        } else {
            return fibonnacci(n - 1) + fibonnacci(n - 2);
        }
    }
}
