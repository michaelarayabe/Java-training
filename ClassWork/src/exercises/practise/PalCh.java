package exercises.practise;

public class PalCh {

    public static void main(String[] args) {
        System.out.println(isPal("12321"));
    }

    public static boolean isPal(String word){

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
