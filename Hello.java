public class Hello {

    public static String getUserName(User user) {
        return user.getName(); // Possible NullPointerException
    }

    public static int divide(int a, int b) {
        return a / b; // No check for division by zero
    }

    public static void printMessage(String message) {
        String unused = "Hello"; // Unused variable
        System.out.println(message);
    }

    public static boolean isAdmin(String role) {
        if (role == "ADMIN") { // Incorrect String comparison
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        User user = null;

        System.out.println(getUserName(user));
        System.out.println(divide(10, 0));
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
