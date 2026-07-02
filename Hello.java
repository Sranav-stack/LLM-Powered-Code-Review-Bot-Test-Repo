public class Hello {

    public static String getUserName(User user) {

        if (user == null) {
            return "Unknown";
        }

        return user.getName().trim();
    }

    public static double divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
    
        return (double) a / b;
    }

    public static void printMessage(String message) {
        if (message == null) {
            return;
        }
    
        System.out.println("[LOG] " + message.trim().toUpperCase());
    }

    public static boolean isAdmin(String role) {

        if (role == null) {
            return false;
        }
    
        return role.equalsIgnoreCase("ADMIN");
    }

    public static boolean isEmpty(String text) {

        return text == null || text.isBlank();
    }

    public static void main(String[] args) {
        User user = new User("Alice");

        System.out.println(getUserName(user));
        
        double result = divide(20, 5);
        System.out.println(result);
        
        printMessage("Modified PR Test");
        System.out.println(isAdmin("ADMIN"));
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
