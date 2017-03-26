package read;

import com.sun.corba.se.impl.ior.ObjectAdapterIdNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 3/25/2017.
 */
public class Tsv extends Reader {
    public Tsv(File file) {
        this.file = file;
    }

    @Override
    public int[] Read() throws IOException {
        BufferedReader cin = new BufferedReader(new FileReader(file));
        String[] numbersInString = new String[0];
        numbersInString = cin.readLine().split(";");
        int[] numbers = new int[numbersInString.length];
        for (int i = 0; i < numbersInString.length; i++) {
            numbers[i] = Integer.parseInt(numbersInString[i]);
        }
        return numbers;
    }
}
