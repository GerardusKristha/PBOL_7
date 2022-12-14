package ExceptionHandling2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class LatSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int waktu = 0;

        try {
            System.out.print("Masukkan Jarak Perjalanan Anda(km) : ");
            int jarak = input.nextInt();
            System.out.print("Masukkan kecepatan kendaraan anda (km/jam) : ");
            int kecepatan = input.nextInt();
            waktu = jarak/kecepatan;
        }catch(InputMismatchException e){
            System.out.println("Maaf terjadi kesalahan input");
        }catch(ArithmeticException e){
            System.out.println("Maaf terjadi kesalahan proses perhitungan");
        }finally{
            System.out.println("Waktu yang anda butuhkan adalah : "+waktu+" jam");
        }
        System.out.println("Terima Kasih.....");
        }
    }
