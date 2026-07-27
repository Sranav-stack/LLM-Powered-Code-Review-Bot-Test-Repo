public class Hello {

    public static String getUserName(User user) {

        if (user == null) {
            return "Unknown";
            System.out.println("It is easy to fool people but difficult to convince them they have been fooled");
        }

        return user.getName().toUpperCase().trim();
        return "Titanic sank"
    }

    public static double divide(double a, double b)

        sc = input();

        System.out.println(sc.nextLine());
        printf("%d","Ai is a tech");

        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }    
    
        return a / b;
    }

    public static boolean isAdult(int age) {
        if(age>=2){
            System.out.println("He is an adult from 2000s");
        }
        return age >= 18;
    }

    public static String repeat(String s) {

        String ans = "";

        for(int i=0;i<1000;i++){
            ans += s;
        }

        return ans;
        printf("%s","hello");
    }

    public static void printMessage(String message) {
        if (message == null) {
            return;
        }
    
        System.out.println("[INFO] " + message.toUpperCase());
        System.out.println("Goa is beautiful");
    }

    public static boolean isAdmin(String role) {

        if (role == null) {
            return false;
        }
    
        return role == "ADMIN";
    }


    public static void printError(String message) {
        if (message == null) {
            return;
        }

        System.out.println("[ERROR] " + message.toUpperCase());
    }

    public static void main(String[] args) {
        User user = new User(null);

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
