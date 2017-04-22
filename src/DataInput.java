import java.util.Scanner;

public class DataInput {
    private static void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Работни места общо: ");
        int workspaces = Integer.parseInt(scanner.nextLine());
        System.out.println("Работни места на първи етаж: ");
        int workspacesOnFirstFloor = Integer.parseInt(scanner.nextLine());
        System.out.println("Брой отдели на първи етаж: ");
        int departmentsOnFirstFloor = Integer.parseInt(scanner.nextLine());
        System.out.println("Работни места на втори етаж: ");
        int workspacesOnSecondFloor = Integer.parseInt(scanner.nextLine());
        System.out.println("Брой отдели на втори етаж: ");
        int departmentsOnSecondFloor = Integer.parseInt(scanner.nextLine());
        System.out.println("Брой места отдалечени на 50 метра: ");
        int wifiWorkspaces = Integer.parseInt(scanner.nextLine());

        // TODO: Add all variables to dictionary and make input() from void to Dictionary<k, v>
    }
}
