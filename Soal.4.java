import java.util.*;
import java.lang.Math;

public class Soal4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalShift, maxShift, minShift;
        double rataRata;
        String maxNama, minNama, kesimpulan;

        totalShift = 0;
        maxShift = -1;
        minShift = 1000;
        System.out.println("Sistem Penjadawalan Shift Asisten Lab");
        System.out.println("Silahkan Masukkan Jumlah Asisten: ");
        n = Integer.parseInt(input.nextLine());
        String[] namaArr = new String[n];
        int[] shiftArr = new int[n];

        for (i = 0; i <= n - 1; i++) {
            namaArr[i] = input.nextLine();
            shiftArr[i] = Integer.parseInt(input.nextLine());
        }
        for (i = 0; i <= n - 1; i++) {
            totalShift = totalShift + shiftArr[i];
            if (shiftArr[i] > maxShift) {
                maxShift = shiftArr[i];
                maxNama = namaArr[i];
            }
            if (shiftArr[i] < minShift) {
                minShift = shiftArr[i];
                minNama = namaArr[i];
            }
        }
        rataRata = (double) totalShift / n;
        System.out.println("Daftar Shift:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(namaArr[i] + " = " + shiftArr[i]);
        }
        System.out.println("");
        System.out.println("Total shift = " + totalShift);
        System.out.println("Rata-rata = " + rataRata);
        System.out.println("Shift terbanyak: " + maxNama + " (" + maxShift + ")");
        System.out.println("Shift tersedikit: " + minNama + " (" + minShift + ")");
        System.out.println("");
        kesimpulan = cekKesimpulan(maxShift, minShift);
        System.out.println(kesimpulan);
    }
    
    public static String cekKesimpulan(int maxVal, int minVal) {
        String pesan;
        int selisih;

        selisih = maxVal - minVal;
        if (selisih >= 3) {
            pesan = "Distribusi shift tidak merata, beberapa asisten terbebani.";
        } else {
            pesan = "Distribusi shift cukup merata.";
        }
        
        return pesan;
    }
}
