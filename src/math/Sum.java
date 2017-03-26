package math;

/**
 * Created by user on 3/26/2017.
 */
public class Sum extends Calculator {
    public Sum(int[] numbers){
        this.numbers = numbers;
    }
    public int sum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
