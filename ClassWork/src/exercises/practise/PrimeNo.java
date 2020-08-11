package exercises.practise;

public class PrimeNo {

    public static void main(String[] args) {

        System.out.println(isPrime(11));
    }

    public static Boolean isPrime(Integer n){

        boolean isPrime = true;

        for(int i = n - 1; i > 1; i--){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
