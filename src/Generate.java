import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Generate {
     List<String> Devices() {
        int departments =   DataInput.departmentsOnFirstFloor +
                            DataInput.departmentsOnSecondFloor +
                            DataInput.DMZ_Router +
                            DataInput.wifiRouter;

        int pc = DataInput.workspaces;
        int wirelessDevices = DataInput.wifiWorkspaces;
         System.out.println("Wifi: " + wirelessDevices);

        // Add routers
        List<String> devices = new ArrayList<>();
        for (int i = 0; i < departments; i++)
            devices.add("R".concat(Integer.toString(i)));

        // Add PC's
        for (int i = 1; i <= pc; i++)
            devices.add("PC".concat(Integer.toString(i)));

        for (int i = 1; i <= wirelessDevices; i++)
            devices.add("WifiDevice".concat(Integer.toString(i)));

        return devices;
    }

    List<String> Interfaces() {
        int numberOfDepartmentRouters = DataInput.departmentsOnFirstFloor + DataInput.departmentsOnSecondFloor;
        int numberOfWifiInterfaces = DataInput.wifiRouter * DataInput.wifiWorkspaces;

        List<String> interfaces = new ArrayList<>();

        //Generates DMZ_Router's interface
        String DMZ_RouterInterface = "G0/1";
        interfaces.add(DMZ_RouterInterface);

        //Generates Department Router interfaces
        for (int i = 0; i <= numberOfDepartmentRouters; i++){
            interfaces.add("G0/0");
            interfaces.add("G0/1");
        }

        //Generates PC interfaces
        for (int i = 0; i < DataInput.workspaces; i++){
            interfaces.add("Fe0");
        }

        //Generates wifi interfaces
        // interfaces.add("F0/0");
        for (int i = 0; i < numberOfWifiInterfaces; i++){
            interfaces.add("wireless-".concat(Integer.toString(i)));
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
