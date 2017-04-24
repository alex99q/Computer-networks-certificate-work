import java.util.Hashtable;

public class NetworkTable {

    private int workspaces;
    private int workspacesOnFirstFloor;
    private int departmentsOnFirstFloor;
    private int workspacesOnSecondFloor;
    private int departmentsOnSecondFloor;
    private int wifiWorkspaces;
    private int DMZ_Router = 1;
    private int wifiRouter = 1;

    private int matrixRows;
    private int matrixCols;
    private String[][] matrix;

    //constructor for initializing the NetworkTable
    public NetworkTable(Hashtable<String, Integer> inputData){
        workspaces = inputData.get("workspaces");
        workspacesOnFirstFloor = inputData.get("workspacesOnFirstFloor");
        departmentsOnFirstFloor = inputData.get("departmentsOnFirstFloor");
        workspacesOnSecondFloor = inputData.get("workspacesOnSecondFloor");
        departmentsOnSecondFloor = inputData.get("departmentsOnSecondFloor");
        wifiWorkspaces = inputData.get("wifiWorkspaces");

        matrixRows = (workspaces + departmentsOnFirstFloor + departmentsOnSecondFloor + DMZ_Router + wifiRouter + wifiWorkspaces) + 1;
        matrixCols = 6;
        matrix = new String[matrixRows][matrixCols];
    }

    public void printTable() {
        setTableLabels();
        generateTable();
    }

    private void setTableLabels() {
        matrix[0][0] = "Device";
        matrix[0][1] = "Interface";
        matrix[0][2] = "Subnet";
        matrix[0][3] = "Ip Address";
        matrix[0][4] = "Subnet Mask";
        matrix[0][5] = "Default Gateway";

        for (int row = 1; row < matrixRows; row++)
            for (int col = 0; col < matrixCols; col++)
                matrix[row][col] = "-";
    }

    private void generateTable() {
        for (int row = 0; row < matrixRows; row++) {
            for (int col = 0; col < matrixCols; col++) {
                if (row > 0) {
                    int optimalLength = matrix[0][col].length() + 8;
                    int currentTextLength = matrix[row][col].length();

                    System.out.print(matrix[row][col]);

                    for (int i = 0; i < optimalLength - currentTextLength; i++)
                        System.out.print(" ");

                } else {
                    System.out.print(matrix[row][col] + "        ");
                }
            }
            System.out.println();
        }
    }

    //A method for Filling the table
    private void FillTable(){
        //TODO: Write algorithm for filling the table
    }
}
