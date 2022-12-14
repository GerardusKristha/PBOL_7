package ExceptionHandling2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class LatDua {

    public static void main(String[] args) {
        int s = 0;
        int v = 0;
        int t = 0;

        try {
            LatDua lat = new LatDua();
            s = lat.getJarak();
            v = lat.getKecepatan();
            t = lat.hitungWaktu(s, v);
        } catch (InputMismatchException e) {
            System.out.println("Maaf terjadi kesalahan input");
        } catch (ArithmeticException e) {
            System.out.println("Maaf terjadi kesalahan perhitungan");
        } finally {
            System.out.println("Waktu yang anda butuhkan adalah: " + t + " jam");
        }
        System.out.println("Terima Kasih.....");
    }

    public int getJarak() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jarak Perjalanan Anda(km): ");
        int jarak = input.nextInt();
        return jarak;
    }

    public int getKecepatan() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kecepatan kendaran anda(km/jam): ");
        int kecepatan = input.nextInt();
        return kecepatan;
    }

    public int hitungWaktu(int jarak, int kecepatan) throws ArithmeticException {
        int waktu = 0;
        waktu = jarak / kecepatan;
        return waktu;
    }
}
