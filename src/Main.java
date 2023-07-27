import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the employees program!");
        String workerProcesses = "1.Software Process\n" + "2.Manager Process\n" +"3.IT Process\n"+ "Exiting.. ";
        System.out.println(workerProcesses);
        while (true) {
            System.out.println("Choose Process! ");
            String process = scanner.nextLine();
            if (process.equals("q")) {
                System.out.println("Exiting...");
                break;
            } else if (process.equals("1")) {

                Software software = new Software("Ezgi", "Azun", 5522, "Java,JavaScript,C#");

                String softwareInputGuide = "1.Development\n" + "2.Show Information\n" + "Press q to exit";
                System.out.println(softwareInputGuide);

                while (true) {
                    System.out.println("Choose Process! ");
                    String softwareInput = scanner.nextLine();
                    if (softwareInput.equals("q")) {
                        System.out.println("Quiting from Software process");
                        break;
                    } else if (softwareInput.equals("1")) {
                        System.out.print("Development: ");
                        String programmingLanguageInput = scanner.nextLine();
                        software.developmentLanguages(programmingLanguageInput);

                    } else if (softwareInput.equals("2")) {
                        software.getEmployeeInformation();
                    } else {
                        System.out.println("Invalid action..");
                    }
                }

            } else if (process.equals("2")) {

                Manager manager = new Manager("Serhat", "Say", 1298, 10);

                String managementInputGuide = "1.Raise Salary \n" + "2.Show Information\n" + "Press q to exit";
                System.out.println(managementInputGuide);

                while (true) {
                    System.out.println("Choose Process!");
                    String managementInput = scanner.nextLine();
                    if (managementInput.equals("q")) {
                        System.out.println("Quiting from Manager process");
                        break;
                    } else if (managementInput.equals("1")) {
                        System.out.print("How much raise you want?");
                        int salaryAmount = scanner.nextInt();
                        scanner.nextLine();
                        manager.makeRaise(salaryAmount);
                    } else if (managementInput.equals("2")) {
                        manager.getEmployeeInformation();
                    } else {
                        System.out.println("Invalid action..");
                    }
                }
            } else if (process.equals("3")) {

                It it = new It("Yeliz", "Demir", 4512, "Linux,Windows,Ios");

                String itInputGuide = "1.Install a program \n" + "2.Show Information\n" + "Press q to exit";
                System.out.println(itInputGuide);

                while (true) {
                    System.out.println("Choose Process!");
                    String itInput = scanner.nextLine();
                    if (itInput.equals("q")) {
                        System.out.println("Quiting from Manager process");
                        break;
                    } else if (itInput.equals("1")) {
                        System.out.print("Operating System: ");
                        String program = scanner.nextLine();
                        it.installProgram(program);
                    } else if (itInput.equals("2")) {
                        it.getEmployeeInformation();
                    } else {
                        System.out.println("Invalid action..");
                    }
                }

            } else {
                System.out.println("Invalid action..");
            }
        }
    }

}

