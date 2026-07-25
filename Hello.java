public class Hello {

    public static String getUserName(User user) {

        if (user == null) {
            return "Unknown";
        }

        return user.getName().trim();
    }

    public static int divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }    
    
        return a / b;
    }

    public static void printMessage(String message) {
        if (message == null) {
            return;
        }
    
        System.out.println("[INFO] " + message.toUpperCase());
    }

    public static boolean isAdmin(String role) {

        if (role == null) {
            return false;
        }
    
        return role.equals("ADMIN");
    }

    public static void main(String[] args) {
        User user = new User("Sranav");

        System.out.println(getUserName(user));
        System.out.println(divide(10, 2));
        printMessage("Testing...");
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
