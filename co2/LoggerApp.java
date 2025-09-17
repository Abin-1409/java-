class User {
    private String password;
    protected String role;
    public String username;
    public final static String SYSTEM_NAME = "AccessLogger";

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void showUserDetails() {
        System.out.println("Username: " + username);
        System.out.println("Role: " + role);
        System.out.println("Password: " + password);
        System.out.println("System: " + SYSTEM_NAME);
    }
}

public class LoggerApp {
    public static void main(String[] args) {
        User u1 = new User("Alice", "12345", "Admin");

        System.out.println("Direct access: " + u1.username);
        System.out.println("System name: " + User.SYSTEM_NAME);

        u1.showUserDetails();
    }
}
