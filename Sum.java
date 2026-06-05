import java.util.Scanner;
class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("ENTER THE FIRST NUMBER");
        num1 = sc.nextDouble();
        System.out.println("ENTER THE SECOND NUMBER");
        num2 = sc.nextDouble();
        System.out.println("Sum of the given two number are :"+(num1 + num2));
        sc.close();
    }
}