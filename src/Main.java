import java.io.IOException;
import java.util.Scanner;
/**
 * @author ED;
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("foreign_names.csv");
        AllDivision allDivision = new AllDivision(4, reader.getOutput());
        System.out.println("Информация о подразделениях с номером ID:" + "\n");
        System.out.println(allDivision.allDivision.toString());
        AboutBass[] aboutBass = new AboutBass[reader.getOutput().length];
        for (int i = 0; i < aboutBass.length; i++) {
            aboutBass[i] = new AboutBass(reader.getOutput()[i], allDivision.getAllDivision());
        }
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        String expression;
        while (number != 0) {
            try {
                System.out.println("Введите номер строки таблицы:" + "\n");
                int count = scanner.nextInt();
                System.out.println(aboutBass[count-1].toString());
                }
            catch (Exception e)
            {
                System.out.println("Неверный ввод");
                break;
            }
        }
        //AboutBassTest aboutBassTest = new AboutBassTest();
    }
}

