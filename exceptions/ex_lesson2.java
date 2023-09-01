import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_lesson2 {

    public static void main(String[] args) {

        boolean programm = true;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

        while (programm) {
            System.out.println("Введите дробное число (через точку): ");

            try {
                float num = Float.parseFloat(bReader.readLine());
                System.out.printf("Вы ввели %f", num);
                programm = false;                
            }

            catch (IOException  e) {
                System.out.println("Вы ввели не дробное число.");
            }
            catch (NumberFormatException n) {
                System.out.println("Вы ввели не число.");
            }

            // а почему при вводе 34573645623646364626436
            // он выдает Вы ввели 34573645698763730000000,000000
            // я должна была использовать не float? я бы предположила, что во float не влезло, если б выдаваемое число не было бы больше, чем введенное

            System.out.println("_____");
            fixing2();


            
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
             
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
            // иерархия ловли исключений
            catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            }               

        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b); 
    }


    public static void fixing2(){
        try {

            //надо задать массив 
        
            int[] arr = {4,1,6,8,4,3,5,4};
            int d = 0;
            double catchedRes1 = arr[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        
           } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
           }
    }


}