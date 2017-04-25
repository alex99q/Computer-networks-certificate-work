import java.util.List;

public class FillTable {
    void Devices() {
        Generate generate = new Generate();

        List<String> devices = generate.Devices();

        int row = 1;
        for (String device : devices) {
            NetworkTable.matrix[row][0] = device;
            row++;
        }
    }

    public void Interfaces() {

    }

    public void SubnetAddress() {

    }

    public void IpAddress() {

    }

    public void SubnetMask() {

    }

    public void DefaultGateway() {

    }
}
