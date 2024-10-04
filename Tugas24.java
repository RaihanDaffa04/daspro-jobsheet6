import java.util.Scanner;
public class Tugas24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);
        String jenisBuku;
        double diskon = 0, harga = 20000.00, totalHarga, totalDiskon;
        int jumlah;
        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input24.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlah = input24.nextInt();
        if (jenisBuku.equalsIgnoreCase ("kamus")) {
            diskon = 0.1;
            if (jumlah > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase ("novel")) {
            diskon = 0.07;
            if (jumlah > 3) {
                diskon += 0.02;
            } else 
            diskon += 0.01;
        } else if (jumlah > 3) {
            diskon = 0.05;
        }
        totalDiskon = diskon * (jumlah * harga);
        totalHarga = (harga * jumlah) - totalDiskon;
        System.out.println("Total diskon : " + totalDiskon);
        System.out.println("Total harga : " + totalHarga);

    }
    
}
