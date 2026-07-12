import java.util.Scanner;

class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter two NUmbers :");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num2 == 0) {

            System.out.println("Division by zero is not allowed");
            sc.close();
            return;
            
        }

        System.out.println("Addition : "+(num1 + num2)+"\nSubtraction : "+(num1 - num2)+"\nMultiplication : "+(num1 * num2)+"\nDivision : "+(num1 / num2)+"\nModulus : "+(num1 % num2));

        sc.close();
    }
}