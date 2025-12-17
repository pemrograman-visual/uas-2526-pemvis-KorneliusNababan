import java.util.*;
import java.lang.Math;

public class Soal2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, stokAwal, terjual, sisa;
        String nama, status;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            System.out.println("Masukkan Nama Barang");
            nama = input.nextLine();
            stokAwal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            sisa = stokAwal - terjual;
            if (sisa > 5) {
                status = "Stok aman";
            } else {
                if (sisa >= 1) {
                    status = "Stok menipis";
                } else {
                    status = "Habis, segera restock!";
                }
            }
            System.out.println(nama);
            System.out.println(stokAwal);
            System.out.println(terjual);
            System.out.println(sisa);
            System.out.println(status);
            System.out.println("Terimakasih telah menggunakan Program ini");
        }
    }
}
