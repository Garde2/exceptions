import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataImpFileWriter implements DataFileWriter {

        @Override
        public void writeData(Data userData) throws IOException {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Имя файла: ");
                String fileName = scanner.nextLine();
                FileWriter writer = new FileWriter(fileName, true);
                String userDataString = String.join(" ", userData.getuName(),
                        userData.getuSurname(),
                        userData.getuFatherName(),
                        String.valueOf(userData.getPhoneNumber()));
                writer.write(userDataString + "\n");
                writer.close();
                System.out.println("Успешно записано: " + fileName);
            }
            catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

