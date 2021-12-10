import java.util.LinkedList;

/**
 * @author ED;
 */
public class AboutBass {
    private String id;
    private String name;
    private String gender;
    private String BirtDate;
    private String Salary;
    private Division division;

    /**
     * @param mas        - массив считаный с файла
     * @param linkedList - все подразделения
     */
    public AboutBass(String[] mas, LinkedList<Division> linkedList)
    {
        this.name = mas[1];
        this.BirtDate = mas[3];
        this.id = mas[0];
        this.Salary = mas[5];
        this.gender = mas[2];
        this.division = linkedList.get(chekDivision(mas[4], linkedList));
    }

    /**
     * @param name       - имя
     * @param birtDate   - день рождения
     * @param salary     - зарплата
     * @param gender     - пол
     * @param division   - бригада
     * @param linkedList - все бригады
     */
    public AboutBass(String name, String birtDate, String salary, String gender, String division, LinkedList<Division> linkedList) {
        this.name = name;
        this.BirtDate = birtDate;
        this.id = Double.toString(Division.generator());
        this.Salary = salary;
        this.gender = gender;
        this.division = linkedList.get(chekDivision(division, linkedList));

    }

    /**
     * @param name       - имя подразделения
     * @param linkedList -  все подразделения
     * @return - номер в списке
     */
    private int chekDivision(String name, LinkedList<Division> linkedList) {
        int count = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getName().equals(name)) {
                count = i;
            }
        }
        return count;

    }
    @Override
    public String toString() {
        return "AboutBass : " + "id='" + id + '\'' +
                ", name ='" + name + '\'' +
                ", gender ='" + gender + '\'' +
                ", BirtDate ='" + BirtDate + '\'' +
                ", Salary ='" + Salary + '\'' +
                ", division = " + division.toString() ;
    }
}

