import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter your choice : \n1.Adddition\n2.Subtraction\n3.Mulyiplication\n4.Division\n5.Remainder\n6.Exit");

        int choice = sc.nextInt();

        switch(choice) {

            case 1: 
                System.out.println("Addition of "+num1+" and "+num2+" is : "+(num1 + num2));
                break;

            case 2:
                System.out.println("Subtraction of "+num1+" and "+num2+" is : "+(num1 - num2));
                break;

            case 3:
                System.out.println("Multiplication of "+num1+" and "+num2+" is : "+(num1 * num2));
                break;

            case 4:
                if(num2 == 0) {

                    System.out.println("Division by zero is not possible.");
                    break;
                }
                
                System.out.println("Division of "+num1+" and "+num2+" is : "+(num1 / num2));
                break;

            case 5:
                System.out.println("Remainder of "+num1+" and "+num2+" is : "+(num1 % num2));
                break;

            case 6:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. please select a valid option.");
        }

        sc.close();

    }
}