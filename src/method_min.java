import java.util.Scanner;

public class method_min {

    public static void main(String[] args) {
        // TODO code application logic here
        int minimum, jumlah, i, lokasi = 1, array[];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah urutan: ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan "+jumlah+" angka");
        for(i = 0; i < jumlah; i++) {
            System.out.print("masukan angka ke-"+ (i+1) +": " );
            array[i] = scan.nextInt();
        }
        minimum = array[0];

        for(i = 0; i < jumlah; i++) {
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
        System.out.println("Nilai Terkecil Adalah "+minimum);
    }
}
