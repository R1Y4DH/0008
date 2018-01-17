import java.util.Scanner;
public class Aktiviti_18D {
public static void main(String[]args){

    double lpintu;
    double ltingkap;
    double ldinding;
    double jawapan;
    
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan Panjang Pintu : ");
    double pjgpintu = input.nextDouble();
    
    System.out.print("Masukkan Tinggi Pintu : ");
    double tngpintu = input.nextDouble();
    
    System.out.print("Masukkan Panjang Tingkap : ");
    double pjgtingkap = input.nextDouble();
    
    System.out.print("Masukkan Tinggi Tingkap : ");
    double tngtingkap = input.nextDouble();

    System.out.print("Masukkan Panjang Dinding : ");
    double pjgdinding = input.nextDouble();
    
    System.out.print("Masukkan Tinggi Dinding : ");
    double tngdinding = input.nextDouble();
    
    lpintu = pjgpintu*tngpintu;
    System.out.println("Luas Pintu : " +lpintu);
    
    ltingkap = pjgtingkap*tngtingkap;
    System.out.println("Luas Tingkap : " +ltingkap);
    
    ldinding = pjgdinding*tngdinding;
    System.out.println("Luas Dinding : " +ldinding);
    
    jawapan = lpintu+(ltingkap*2)+(ldinding*4);
    System.out.println("Luas 1 Pintu 2 Tingkap Sama Saiz 4 Sisi Dinding Sama Saiz : " +jawapan);
    }
}
I leave the rest