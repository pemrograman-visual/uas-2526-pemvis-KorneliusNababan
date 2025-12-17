import java.util.*;
import java.lang.Math;

public class Soal1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, rating, sum, min, max, countHight;
        double rata;
        String daftarRating;

        n = Integer.parseInt(input.nextLine());
        sum = 0;
        countHight = 0;
        min = 1;
        max = -1;
        daftarRating = "daftar rating";
        for (i = 1; i <= n; i++) {
            rating = Integer.parseInt(input.nextLine());
            daftarRating = daftarRating + " " + rating;
            sum = sum + rating;
            if (rating > max) {
                max = rating;
            }
            if (rating < min) {
                min = rating;
            }
            if (rating >= 4) {
                countHight = countHight + 1;
            }
        }
        rata = (double) sum / n;
        System.out.println(daftarRating);
        System.out.println("Rata rata: " + toFixed(rata,2));
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);
        System.out.println("Review rating >= 4: " + countHight + "orang");
        System.out.println("Kondisi cukup,masih perlu peningkatan");
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
