import java.util.*;
import java.lang.Math;

public class Soal3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, m, grandTotal;
        String statusAkhir;

        grandTotal = 0;
        System.out.println("Silahkan Anda Masukkan Jumlah Penghuni");
        n = Integer.parseInt(input.nextLine());
        String[] namaArr = new String[n];
        int[] subTotalArr = new int[n];

        for (i = 0; i <= n - 1; i++) {
            namaArr[i] = input.nextLine();
            m = Integer.parseInt(input.nextLine());
            subTotalArr[i] = hitungSubTotal(m);
            grandTotal = grandTotal + subTotalArr[i];
        }
        System.out.println("Total konsumsi:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(namaArr[i] + " = " + subTotalArr[i] + " wh");
        }
        System.out.println("");
        System.out.println("Total konsumsi kamar = " + grandTotal + " wh");
        statusAkhir = cekStatus(grandTotal);
        System.out.println(statusAkhir);
    }
    
    public static String cekStatus(int totalWh) {
        String pesan;

        if (totalWh <= 1000) {
            pesan = "Konsumsi masih dalam batas wajar.";
        } else {
            pesan = "Konsumsi berlebihan, harap hemat energi.";
        }
        
        return pesan;
    }
    
    public static int hitungSubTotal(int jumlahBarang) {
        int j, watt, total;

        total = 0;
        for (j = 1; j <= jumlahBarang; j++) {
            watt = Integer.parseInt(input.nextLine());
            total = total + watt;
        }
        
        return total;
    }
}
