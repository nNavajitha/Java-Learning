import java.util.Scanner;

class StudentInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }
}