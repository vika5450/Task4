/**
 * @author ED;
 */
public class Division {
    private String ID;
    private String name;

    /**
     * @param name - Название подразделения
     */
    public Division(String name) {
        this.name = name;
        this.ID = Double.toString(generator());
    }

    public String getName() {
        return name;
    }

    /**
     * Генерация номера ID
     * @return случйное значение - ID
     */
    public static int generator()
    {
        return (int) (Math.random() * 1000000);
    }

    @Override
    public String toString() {
        return "Division : " + "ID='" + ID + '\'' + "name='" + name + '\'' + "\n";

    }
}

