import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class AboutBassTest {
    /**
     * @throws IOException - стандартное исключение
     */
    @Test
    public void TestField() throws IOException {
        Reader reader = new Reader("test.csv");
        Reader readerTwo = new Reader("testTwo.csv");
        List<String> tmpOne = new ArrayList<>();
        tmpOne.add(reader.output[0][0]);
        tmpOne.add(readerTwo.output[0][0]);
        tmpOne.add(readerTwo.output[1][0]);
        List<String> tmpTwo = new ArrayList<>();
        String countOne = "11111";
        String[][] countTwo = {{"124124"}, {"435636"}};
        tmpTwo.add(countOne);
        tmpTwo.add(countTwo[0][0]);
        tmpTwo.add(countTwo[1][0]);
        Assert.assertEquals(tmpOne, tmpTwo);


    }
}