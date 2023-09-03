import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class ex_lesson3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputReader inputReader = new InputConsoleReader(scanner);
        DataFileWriter fileWriter = new DataImpFileWriter();

        try {
            Data userData = inputReader.readData();
            fileWriter.writeData(userData);
        } catch (DataException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }   

}
