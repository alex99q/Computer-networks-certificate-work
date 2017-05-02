import java.util.ArrayList;
import java.util.List;

public class Generate {
    List<String> Devices() {
        int departments =   DataInput.workspacesOnFirstFloor +
                            DataInput.workspacesOnSecondFloor +
                            DataInput.DMZ_Router +
                            DataInput.wifiRouter;
        int pc = DataInput.workspaces + DataInput.wifiWorkspaces;

        // Add routers
        List<String> devices = new ArrayList<>();
        for (int i = 0; i < departments; i++)
            devices.add("R".concat(Integer.toString(i)));

        // Add PC's
        for (int i = 1; i < pc; i++) {
            devices.add("PC".concat(Integer.toString(i)));
        }

        return devices;
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
