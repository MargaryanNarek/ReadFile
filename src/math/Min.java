package math;

/**
 * Created by user on 3/26/2017.
 */
public class Min extends Calculator {
    public Min(int[] numbers){
        this.numbers = numbers;
    }
    public int min(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(min > numbers[i])
                min = numbers[i];
        }
        return min;
    }
}
