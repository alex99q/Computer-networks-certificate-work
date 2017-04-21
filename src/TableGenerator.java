public class TableGenerator {
    private static final int matrixRows = 9;
    private static final int matrixCols = 6;
    private static String[][] matrix;

    public void entryPoint() {
        createTable();
        setTableLabels();
        printTable();
    }

    private static void createTable() {
        matrix = new String[matrixRows][matrixCols];
    }

    private static void setTableLabels() {
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

    private static void printTable() {
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
}
