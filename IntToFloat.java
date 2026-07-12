import java.util.Scanner;

class IntToFloat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        float f = num;

        System.out.println(num+" is converted to float : "+f);

        sc.close();

    }
}