import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Generate {
     public List<String> Devices() {
        int departments =   DataInput.departmentsOnFirstFloor +
                            DataInput.departmentsOnSecondFloor +
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

    public List<String> Interfaces() {
        int numberOfDepartmentRouters = DataInput.departmentsOnFirstFloor + DataInput.departmentsOnSecondFloor;

        // "1" is the "G0/0" interface
        int numberOfWifiInterfaces = DataInput.wifiRouter * DataInput.wifiWorkspaces + 1;

        List<String> interfaces = new ArrayList<>();

        String DMZ_RouterInterface = "G0/1";
        interfaces.add(DMZ_RouterInterface);

        for (int i = 0; i < numberOfDepartmentRouters; i++){
            interfaces.add("G0/0");
            interfaces.add("G0/1");
        }

        for (int i = 0; i < numberOfWifiInterfaces; i++){
            interfaces.add("G0/".concat(Integer.toString(i)));
        }

        return interfaces;
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
