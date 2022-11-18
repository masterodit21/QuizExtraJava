import java.util.Scanner;

public class Vokal {
    public static void main(String args[]){
        Scanner kalimat = new Scanner(System.in);
        int count=0;
        String hk,al = new String();

        System.out.print("masukan String : ");al = kalimat.nextLine() ;
        char tchar[] = new char[al.length()];
        hk = al.toLowerCase();
        for(int x=0; x<al.length();x++){
            if(hk.charAt(x)=='a' || hk.charAt(x)=='i' || hk.charAt(x)=='u' || hk.charAt(x)=='e' || hk.charAt(x)=='o'){
                count++;
            }
        }
        System.out.println("Number of  Vowels in the string : "+count);

    }
}
