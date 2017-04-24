import java.util.Hashtable;

public class Startup {
    public static void main(String[] args) {
        Hashtable<String, Integer> inputData = new Hashtable<>(DataInput.input());

        NetworkTable table = new NetworkTable(inputData);
        table.printTable();
    }
}
