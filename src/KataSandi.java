import java.util.Scanner;

public class KataSandi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//  Password Rules :
//  Kata sandi harus memiliki setidaknya sepuluh karakter.
//  Kata sandi hanya terdiri dari huruf dan angka.
//  Kata sandi harus berisi setidaknya dua digit.

        System.out.println("1. Kata sandi harus memiliki setidaknya delapan karakter.");
        System.out.println("2. Kata sandi hanya terdiri dari huruf dan angka.");
        System.out.println("3. Kata sandi harus berisi setidaknya dua digit.");
        System.out.print("Masukan Kata Sandi : ");
        String str = input.nextLine();

        boolean b = password(str);
        if (b)
            System.out.println("Kata Sandi Valid: " + str);
        else
            System.out.println("Kata Sandi Tidak Valid: " + str);

    }
    public static boolean password(String s){
        if (s.length() < 8)
            return false;
        int l = 0;
        int d = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)))
                l++;
            if (Character.isDigit(Integer.valueOf(s.charAt(i))))
                d++;
        }
        return l+d == s.length() && d >= 2;
    }
}
