import java.util.LinkedList;

/**
 * @author ED;
 */
public class AllDivision {
    LinkedList<Division> allDivision = new LinkedList<>();

    public AllDivision(int index, String[][] input)
    {
        checkDivision(input, index);
    }

    /**
     * @param ary   - массив считанный с файла
     * @param index - индекс элемента
     */
    private void checkDivision(String[][] ary, int index) {
        for (int p = 0; p < 2; p++) {
            if (allDivision.isEmpty())
            {
                allDivision.add(new Division(ary[0][index]));
            }
            else {
                int count = 0;
                for (String[] strings : ary) {
                    for (Division division : allDivision)
                    {
                        if (strings[index].equals(division.getName()))
                        {
                            count++;
                        }
                    }
                    if (count == 0) {
                        allDivision.add(new Division(strings[index]));
                    }
                    count = 0;
                }
            }
        }
    }

    public LinkedList<Division> getAllDivision() {
        return allDivision;
    }
}

