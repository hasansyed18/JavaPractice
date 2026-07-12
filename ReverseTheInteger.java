import java.util.Scanner;

class ReverseTheInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to be Reversed : ");

        int num = sc.nextInt();

        if(num < 0) {

            System.out.print("-");
            num = -num;

        } else if(num == 0) {

            System.out.print("0");
            
        }

        while(num != 0) {
            
            int rev = num % 10;

            System.out.print(rev);

            num = num / 10;

        }

        sc.close();
        
    }
}