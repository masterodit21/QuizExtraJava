import java.util.Scanner;

public class AreaPentagon {
    public static void main(String args[]) {
        int s;
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Sisi : ");
        s = input.nextInt();
        System.out.print("Masukan Sisi : ");
        a = input.nextInt();


        double area_pentagon=(long)(5.0/2.0)*s*a;
        System.out.println("Area dari pentagon adalah = "+area_pentagon);
    }
}
