public class Startup {
    public static void main(String[] args) {
        DataInput data = new DataInput();
        NetworkTable table = new NetworkTable();
        FillTable fillTable = new FillTable();
        Generate generate = new Generate();

        data.input();
        table.generateMatrix();
        table.setTableLabels();
        fillTable.Devices();
        fillTable.Interfaces();
        fillTable.SubnetMask();
        table.printTable();
    }
}
