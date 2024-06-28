public class HelloGoodbye {
    public static void main(String[] args) {

        // Extract names from command-line arguments
        String name1 = args[0];
        String name2 = args[1];

        // Print hello message
        System.out.println("Hello " + name1 + " and " + name2 + ".");

        // Print goodbye message with names in reverse order
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}
