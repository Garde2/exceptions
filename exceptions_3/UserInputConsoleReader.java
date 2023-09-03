import java.util.Scanner;


public class UserInputConsoleReader implements UserInputReader {
        private Scanner scanner;

        public UserInputConsoleReader(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public UserData readUserData() throws UserDataException {

            while (true) {
                System.out.println(
                        "Введите: Фамилия Имя Отчетство номерТелефона (ФИО через пробел, а цифры телефона - слитно)!\n");

                try {
                    String input = scanner.nextLine();
                    String[] data = input.split(" ");

                    if (data.length != 4) {
                        throw new UserDataException("Введено неверное количество данных");
                    }

                    long phoneNumber = parsePhoneNumber(data[3]);                    

                    return new UserData(data[0], data[1], data[2], phoneNumber);
                } catch (ParseException | NumberFormatException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

            }
        }

        private long parsePhoneNumber(String phoneNumberString) throws ParseException {

            try {
                return Long.parseLong(phoneNumberString);
            } catch (NumberFormatException e) {
                throw new ParseException("Неверный формат номера телефона");
            }
        }

        public class ParseException extends Exception {

            public ParseException(String message) {
                super(message);
            }
        
        }

    }