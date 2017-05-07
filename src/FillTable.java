import java.util.List;

public class FillTable {
    private Generate generate = new Generate();
    void Devices() {
        List<String> devices = generate.Devices();

        int deviceNumber = 0;
        for (int row = 1; row < devices.size() * 2; row++) {
            try {
                if (devices.get(deviceNumber).startsWith("R")) {
                    NetworkTable.matrix[row][0] = devices.get(deviceNumber);
                    NetworkTable.matrix[row + 1][0] = ""; // clear dash on next row
                    deviceNumber++;
                    row++;
                } else {
                    NetworkTable.matrix[row][0] = devices.get(deviceNumber);
                    deviceNumber++;
                }
            } catch (IndexOutOfBoundsException ignored) {

            }
        }
    }

    void Interfaces() {
        List<String> interfaces = generate.Interfaces();

        int row = 2; // starting row

        for (String Interface : interfaces) {
            NetworkTable.matrix[row][1] = Interface;
            row++;
        }
    }

    public void SubnetAddress() {

    }

    public void IpAddress() {

    }

    public void SubnetMask() {
        String newSnM = generate.SubnetMask();

        for (int row = 1; row < NetworkTable.matrixRows; row++) {
            NetworkTable.matrix[row][4] = newSnM;
        }
    }

    public void DefaultGateway() {

    }
}
