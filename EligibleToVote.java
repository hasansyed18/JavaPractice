import java.util.Scanner;

class EligibleToVote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age : ");
        int age = sc.nextInt();

        String s = age <= 0 ? "Enter a valid age" :age >= 18 ? "you are eligible to vote!" : "you are not eligible to vote!";

        System.out.println(s);
        
        sc.close();

    }
}