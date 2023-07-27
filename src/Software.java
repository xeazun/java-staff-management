public class Software extends Employee {
    private final String programmingLanguages;
    public Software(String firstName, String lastName, int id, String programmingLanguages) {
        super(firstName, lastName, id);
        this.programmingLanguages=programmingLanguages;
    }
    public void developmentLanguages(String developmentLanguages){
        System.out.println(getFirstName()+" develops a software with "+developmentLanguages);
    }
    @Override
    public void getEmployeeInformation() {
        super.getEmployeeInformation();
        System.out.println("Languages the developer knows: "+programmingLanguages);
    }
}
