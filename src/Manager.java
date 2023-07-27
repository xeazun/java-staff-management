public class Manager extends Employee {
    private final int numberOfPersonsResponsible;

    public Manager(String firstName, String lastName, int id, int numberOfPersonsResponsible) {
        super(firstName, lastName, id);
        this.numberOfPersonsResponsible = numberOfPersonsResponsible;
    }

    @Override
    public void getEmployeeInformation() {
        super.getEmployeeInformation();
        System.out.println("Number of people in charge of the manager: "+ numberOfPersonsResponsible);
    }
    public void makeRaise(int raise){
        System.out.println(getFirstName() + "made up to "+raise+ " raises for the employees");
    }
}
