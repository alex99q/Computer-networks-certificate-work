public class Startup {
    public static void main(String[] args) {
        DataInput data = new DataInput();
        NetworkTable table = new NetworkTable();
        FillTable fillTable = new FillTable();

        data.input();
        table.generateMatrix();
        table.setTableLabels();
        fillTable.Devices();
        table.printTable();
    }
}
