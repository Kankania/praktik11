

/**
 *
 * @author komputer25
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer25\\Documents\\kania\\Student.csv";  // Mengoreksi nama variabel csvFile
        String line;
        String csvSplitBy = ",";
        int indeks = 0;
        
        System.out.println("NIM,NAMA,UMUR,PRODI");  // Header yang dicetak di awal
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
                if (indeks > 1) {  // Memulai dari indeks 2 untuk melewati header
                    String[] student = line.split(csvSplitBy);
                    System.out.println(student[0] + "," + student[1] + "," + student[2] + "," + student[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    

