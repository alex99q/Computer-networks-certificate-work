import java.util.Hashtable;
import java.util.Scanner;

public class DataInput {
    private static Hashtable<String, Integer> inputData = new Hashtable<String, Integer>();

    public static Hashtable<String, Integer> input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Работни места общо: ");
        int workspaces = Integer.parseInt(scanner.nextLine());
        inputData.put("workspaces", workspaces);

        System.out.println("Работни места на първи етаж: ");
        int workspacesOnFirstFloor = Integer.parseInt(scanner.nextLine());
        inputData.put("workspacesOnFirstFloor", workspacesOnFirstFloor);

        System.out.println("Брой отдели на първи етаж: ");
        int departmentsOnFirstFloor = Integer.parseInt(scanner.nextLine());
        inputData.put("departmentsOnFirstFloor", departmentsOnFirstFloor);

        System.out.println("Работни места на втори етаж: ");
        int workspacesOnSecondFloor = Integer.parseInt(scanner.nextLine());
        inputData.put("workspacesOnSecondFloor", workspacesOnSecondFloor);

        System.out.println("Брой отдели на втори етаж: ");
        int departmentsOnSecondFloor = Integer.parseInt(scanner.nextLine());
        inputData.put("departmentsOnSecondFloor", departmentsOnSecondFloor);

        System.out.println("Брой места отдалечени на 50 метра: ");
        int wifiWorkspaces = Integer.parseInt(scanner.nextLine());
        inputData.put("wifiWorkspaces", wifiWorkspaces);

        return inputData;
    }
}
