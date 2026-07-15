import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while(temp != 0) {

            int r = temp % 10;
            int fac = 1;

            for(int i = r; i > 0; i--) {

                fac = fac * i;
            
            }

            sum = sum + fac;
            temp = temp / 10;

        }

        if(sum == num) {

            System.out.println(num+" is a Strong Number.");

        } else {

            System.out.println(num+" is not a Strong Number.");

        }

        sc.close();
        
    }
}