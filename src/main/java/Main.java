import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter a command:");
        do{
            String command = scanner.next();
            if(command.contentEquals("add")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(calc.add(a, b));
            }
            else if(command.contentEquals("subtract")){
                System.out.println(calc.subtract(scanner.nextInt(), scanner.nextInt()));
            }
            else if(command.contentEquals("multiply")){
                System.out.println(calc.multiply(scanner.nextInt(), scanner.nextInt()));
            }
            else if(command.contentEquals("divide")) {
                System.out.println(calc.divide(scanner.nextInt(), scanner.nextInt()));
            }
            else if(command.contentEquals("fibonacci")){
                System.out.println(calc.fibonacciNumberFinder(scanner.nextInt()));
            }
            else if(command.contentEquals("binary")){
                System.out.println(calc.intToBinaryNumber(scanner.nextInt()));
            }
                System.out.println("Enter a command:");
        }while(scanner.hasNext());
    }
}
