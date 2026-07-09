import java.util.Scanner;

class CalculatorInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));

        sc.close();
    }
}