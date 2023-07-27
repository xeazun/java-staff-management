public class It extends Employee {
    private final String operatingSystem;

    public It(String firstName, String lastName, int id, String operatingSystem) {
        super(firstName, lastName, id);
        this.operatingSystem = operatingSystem;
    }
    public void installProgram(String installProgram){
        System.out.println(getFirstName()+" is installing the "+installProgram);
    }
    public void getEmployeeInformation() {
        super.getEmployeeInformation();
        System.out.println("Operating systems that IT knows "+ operatingSystem);
    }
}
