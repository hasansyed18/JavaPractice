import java.util.Scanner;

class Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Range : ");
        int num = sc.nextInt();

        System.out.println("Even Number from 0 to "+num);

        for(int i = 1; i <= num; i++) {

            if(i % 2 == 0) {

                System.out.print(i+" ");

            }

        }

        sc.close();

    }
}