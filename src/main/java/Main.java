import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to the calculator");
        System.out.println("Enter a command: (enter \"help\" for a list of commands)");

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine();
            String[] tokens = command.split(" ");

            if (tokens[0].equals("help")) {
                System.out.print("=====================\n" +
                        "add x y\n" +
                        "subtract x y\n" +
                        "multiply x y\n" +
                        "divide x y\n" +
                        "fibonacci n\n" +
                        "binary n\n" +
                        "=====================\n");
            } else if (tokens[0].equals("add")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                int sum = calculator.add(a, b);
                System.out.println(sum);
            } else if (tokens[0].equals("subtract")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                int diff = calculator.subtract(a, b);
                System.out.println(diff);
            } else if (tokens[0].equals("multiply")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                int product = calculator.multiply(a, b);
                System.out.println(product);
            } else if (tokens[0].equals("divide")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                int quotient = calculator.divide(a, b);
                System.out.println(quotient);
            } else if (tokens[0].equals("fibonacci")) {
                int n = Integer.parseInt(tokens[1]);
                int fib = calculator.fibonacciNumberFinder(n);
                System.out.println(fib);
            } else if (tokens[0].equals("binary")){
                int n = Integer.parseInt(tokens[1]);
                String binary = calculator.intToBinaryNumber(n);
                System.out.println(binary);
            } else if (tokens[0].equals("quit")) {
                System.out.println("quitting program ...");
                return;
            } else {
                System.out.println(tokens[0] + " is not a valid command");
            }
        }
    }
}
