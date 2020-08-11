package playground.others;

public class Som {

    public static void main(String[] args) {

        int[] num = {1,2};

        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum = num[i] + sum;
        }

        System.out.println(sum);
    }
}
