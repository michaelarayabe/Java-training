package exercises.practise;

public class Pprime {

    public static void main(String[] args) {

        System.out.println(isPrime(9));

    }

    public static Boolean isPrime(Integer n){

        boolean isPrime = true;

        for(int i = 2; i < n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
