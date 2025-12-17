import java.util.*;
import java.lang.Math;

public class Soal5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalLolos, junk;
        String status;

        totalLolos = 0;
        n = Integer.parseInt(input.nextLine());
        String[] namaArr = new String[n];
        double[] ipkArr = new double[n];
        int[] gajiArr = new int[n];

        for (i = 0; i <= n - 1; i++) {
            namaArr[i] = input.nextLine();
            ipkArr[i] = Double.parseDouble(input.nextLine());
            gajiArr[i] = Integer.parseInt(input.nextLine());
            junk = Integer.parseInt(input.nextLine());
        }
        System.out.println("");
        for (i = 0; i <= n - 1; i++) {
            status = CekKelulusan(ipkArr[i], gajiArr[i]);
            System.out.println(namaArr[i] + " -> " + status);
            if (status.equals("Lolos Syarat Awal")) {
                totalLolos = totalLolos + 1;
            }
        }
        System.out.println("");
        System.out.println("Total pendaftar lolos: " + totalLolos);
    }
}
