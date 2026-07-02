public class Hello {

    public static String getUserName(User user) {
        return user.getName(); // Possible NullPointerException
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    
        return a / b;
    }

    public static void printMessage(String message) {
        System.out.println("Message:");
        System.out.println(message);
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
