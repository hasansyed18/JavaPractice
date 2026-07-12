import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three Numbers :");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        String largest = (num1 > num2 && num1 > num3) ? num1+" is the Largest Number" : (num2 > num3) ? num2+" is the Largest Number" : num3+" is the Largest Number";

        System.out.println(largest);

        sc.close();
        
    }
}