package math;

/**
 * Created by user on 3/26/2017.
 */
public class Max extends Calculator {
    public Max(int[] numbers){
        this.numbers = numbers;
    }
    public int max(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(max < numbers[i])
                max = numbers[i];
        }
        return max;
    }
}
