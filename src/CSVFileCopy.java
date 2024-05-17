import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\komputer25\\Documents\\kania\\Asal.csv";
        String destinationFile = "C:\\Users\\komputer25\\Documents\\kania\\Tujuan.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
