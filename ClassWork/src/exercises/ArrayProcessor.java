package exercises;

@FunctionalInterface
public interface ArrayProcessor {

    double apply(double[] array);

    public static int counter(double[] array, double value){

        int counting = 0;
        for(double x : array){
            if(x == value){
                counting +=1;
            }
        }

        return counting;
    }
}
