public class IpTableMethods {
    int countSnBits (int subnetCount) {
        int subnetBits = 1;

        while (true) {
            if (Math.pow(2, subnetBits) >= subnetCount) {
                break;
            } else {
                subnetBits++;
            }
        }
        return subnetBits;
    }

    String transformToSbnAddress (String addressClass) {
        // transform address class to subnet address
        switch (addressClass) {
            case "A":
                return  "255.0.0.0";
            case "B":
                return  "255.255.0.0";
            case  "C":
                return  "255.255.255.";
        }
        return null;
    }

    // TODO: write methods to SnmA and SbnB

    String modifySnmC (int subnetBits) {
        String modifySnm = "";
        for (int i = 0; i < 8; i++) {
            if (i < subnetBits) modifySnm += "1";
            else modifySnm += "0";
        }

        return modifySnm;
    }
}
