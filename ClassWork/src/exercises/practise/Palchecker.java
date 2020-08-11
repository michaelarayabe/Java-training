package exercises.practise;

public class Palchecker {

    public static void main(String[] args) {

        System.out.println(isPalindrome("1234321"));
    }

    public static boolean isPalindrome(String word){

        int x = 0;
        int y = word.length() - 1;

        while(y > x){

            if(word.charAt(x) != word.charAt(y)){
                return false;
            }
            ++x;
            --y;
        }
        return true;
    }
}
