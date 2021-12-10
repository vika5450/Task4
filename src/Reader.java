import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ED;
 */
public class Reader {
    /**
     *Конечный массив
     */
    protected String[][] output;

    /**
     *
     * @param input - путь к файлу
     * @throws IOException - стандартное исключение
     */
    public Reader(String input) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        output = new String[checkAllString(input)][checkAllPillar(input)];
        int i = 0;
        String line;
        String[] splits;
        while ((line = bufferedReader.readLine()) != null) {
            splits = line.split(";");
            System.arraycopy(splits, 0, output[i], 0, output[i].length);
            i++;
        }
    }

    /**
     *
     * @param input - путь до файла
     * @return i - количество строк
     * @throws IOException - стандартное исключение
     */
    public static int checkAllString(String input) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        int i = 0;
        while (bufferedReader.readLine() != null) {
            i++;
        }
        return i;
    }

    /**
     *
     * @param input - путь до файла
     * @return - количество столбцов
     * @throws IOException - стнадартное исключение
     */
    public static int checkAllPillar(String input) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        String line = bufferedReader.readLine();
        String[] pillar = line.split(";");
        return pillar.length;
    }

    /**
     *
     * @return
     */

    public String[][] getOutput() {
        return output;
    }
}

