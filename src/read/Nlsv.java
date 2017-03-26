package read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 3/25/2017.
 */
public class Nlsv extends Reader {
    public Nlsv(File file) {
        this.file = file;
    }

    int[] A = new int[3];

    @Override
    public int[] Read() throws IOException {
        BufferedReader cin = new BufferedReader(new FileReader(file));
        BufferedReader cin1 = new BufferedReader(new FileReader(file));
        String[] numbersInString = new String[100];
        int n = 0;
        while (cin1.readLine() != null) {
            ++n;
        }
        for (int i = 0; i <n; i++) {
            numbersInString[i] = cin.readLine();
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numbersInString[i]);
        }
        return numbers;
    }
}
