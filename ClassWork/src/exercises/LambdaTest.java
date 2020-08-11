package exercises;

import java.util.Arrays;

public class LambdaTest {

    public static final ArrayProcessor sum = array -> {
        double som = 0;
        for (double v : array) {
            som = (som + v);
        }
        return som;
    };



    public static final ArrayProcessor gemiddelde = array ->

        sum.apply(array)/array.length;

        /*double som = 0;
        for(double i : array){
            som += i;
        }

        return som/array.length; */


    public static final ArrayProcessor maximale = array -> {
        double temp = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > temp){
                temp = array[i];
            }
        }
        return temp;
    };

    public static final ArrayProcessor minimumwaarde = array -> {
        double temp = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < temp){
                temp = array[i];
            }
        }
        return temp;
    };


    public static ArrayProcessor counter(double value){

        //return array -> ArrayProcessor.counter(array, value);

        return array -> {
            double counter = 0;
            for(double v : array){
                if(v==value) counter++;
            }
            return counter;
        };
    }
}
















