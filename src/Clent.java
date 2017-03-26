import math.Max;
import math.Min;
import math.Sum;
import read.Csv;
import read.Nlsv;
import read.Tsv;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Clent {

    int[] numbers = new int[0];


    public int start(String nameFile) throws IOException {
        switch (nameFile.split("\\.")[nameFile.split("\\.").length - 1]) {
            case "csv":
                File file1 = new File("C:\\Users\\user\\Desktop\\New folder\\input1.csv");
                Csv csv = new Csv(file1);
                numbers = csv.Read();
                break;
            case "tsv":
                File file2 = new File("C:\\Users\\user\\Desktop\\New folder\\input2.tsv");
                Tsv tsv = new Tsv(file2);
                numbers = tsv.Read();
                break;
            case "nlsv":
                File file3 = new File("C:\\Users\\user\\Desktop\\New folder\\input3.nlsv");
                Nlsv nlsv = new Nlsv(file3);
                numbers = nlsv.Read();
                break;
            default:
                System.out.println("chnq karox aydpisi fayl kardal");
                return 0;
        }
        System.out.println("mutqagreq hashvichi hamar@ 1 - sum, 2 - min, 3 - max");
        int calculatorNumbers;
        Scanner scanner = new Scanner(System.in);
        calculatorNumbers = scanner.nextInt();
        switch (calculatorNumbers) {
            case 1:
                Sum sum = new Sum(numbers);
                return sum.sum(numbers);
            case 2:
                Min min = new Min(numbers);
                return min.min(numbers);
            case 3:
                Max max = new Max(numbers);
                return max.max(numbers);
            default:
                System.out.println("aydpisi hashvich chunenq");
        }

        return 0;
    }
}
