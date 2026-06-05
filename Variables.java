import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME :");
        String name = sc.nextLine();
        System.out.println("ENTER YOUR AGE :");
        int age = sc.nextInt();
        System.out.println("ENTER YOUR HEIGHT :");
        float height = sc.nextFloat();
        System.out.println("NAME : "+name+"\nAGE : "+age+"\nHEIGHT : "+height);
        sc.close();
    }
}