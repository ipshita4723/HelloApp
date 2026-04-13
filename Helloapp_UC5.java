public class Helloapp_UC5 {
    public static void main(String[] args) {
        // Check if any command-line arguments were provided
        if (args.length > 0) {
            // Use an enhanced for loop to iterate through all names
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            // Default message if no arguments are passed
            System.out.println("Hello, World!");
        }
    }
}