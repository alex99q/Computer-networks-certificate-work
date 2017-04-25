import java.util.Scanner;

class DataInput {
    static int workspaces;
    static int workspacesOnFirstFloor;
    static int departmentsOnFirstFloor;
    static int workspacesOnSecondFloor;
    static int departmentsOnSecondFloor;
    static int wifiWorkspaces;
    static int DMZ_Router = 1;
    static int wifiRouter = 1;

     void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Работни места общо: ");
        workspaces = Integer.parseInt(scanner.nextLine());

        System.out.println("Работни места на първи етаж: ");
        workspacesOnFirstFloor = Integer.parseInt(scanner.nextLine());

        System.out.println("Брой отдели на първи етаж: ");
        departmentsOnFirstFloor = Integer.parseInt(scanner.nextLine());

        System.out.println("Работни места на втори етаж: ");
        workspacesOnSecondFloor = Integer.parseInt(scanner.nextLine());

        System.out.println("Брой отдели на втори етаж: ");
        departmentsOnSecondFloor = Integer.parseInt(scanner.nextLine());

        System.out.println("Брой места отдалечени на 50 метра: ");
        wifiWorkspaces = Integer.parseInt(scanner.nextLine());
    }
}
