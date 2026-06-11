import java.util.Scanner;
class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        String sp = sc.nextLine();
        System.out.println("Enter a Number as String : ");
        String s = sc.nextLine();
        int num = Integer.valueOf(s);
        String str = Integer.toString(n);
        System.out.println("STRING TO INTEGER : "+num);
        System.out.println("INTEGER TO STRING : "+str);
        sc.close();
    }
}
