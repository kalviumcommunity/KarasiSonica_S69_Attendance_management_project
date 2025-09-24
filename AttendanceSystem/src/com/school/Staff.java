public class Staff extends Person {
    private String role;

    public Staff(String name, String role) {
        super(name);
        this.role = role;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Staff, Duty: " + role);
    }

    public String getRole() {
        return role;
    }
}
