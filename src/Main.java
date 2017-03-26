import read.Csv;
import read.Nlsv;
import read.Tsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String nameFile;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mutqagret fayli anun@");
        nameFile = scanner.next();

        Clent clent = new Clent();

        System.out.println();
        System.out.println(clent.start(nameFile));
    }

}
