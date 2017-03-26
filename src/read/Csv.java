package read;

import java.io.*;

/**
 * Created by user on 3/25/2017.
 */
public class Csv extends Reader {

    public Csv(File file){
        this.file = file;
    }

    @Override
    public int[] Read() throws IOException {
        BufferedReader cin = new BufferedReader(new FileReader(file));
        String[] numbersInString = new String[0];
        numbersInString = cin.readLine().split(",");
        int[] numbers = new int[numbersInString.length];
        for (int i = 0; i < numbersInString.length; i++) {
            numbers[i] = Integer.parseInt(numbersInString[i]);
        }
        return numbers;
    }
}