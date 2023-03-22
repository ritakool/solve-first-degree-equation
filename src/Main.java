import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập các hằng só:");
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.printf("Phương trình có ngiệm là x= %f!\n", x);
        } else {
            if (b == c){
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Vô ngiệm");
            }
        }
    }
}