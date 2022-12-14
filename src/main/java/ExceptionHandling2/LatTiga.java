package ExceptionHandling2;

import java.util.Scanner;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class LatTiga {
    public static void main(String[] args) {
        LatTiga lat = new LatTiga();
        
        System.out.println("***Input Data Pelamar***");
        boolean ask = true;
        while(ask){
            try {
                System.out.print("NIM: ");
                lat.getNIM();
                ask = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        ask = true;
        System.out.print("Nama: ");
        lat.getNama();
        
        while(ask){
            try {
                System.out.print("IPK: ");
                lat.getIPK();
                ask = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Terima kasih, data sudah kami simpan....");
    }
    public String getNIM()throws Exception{
        Scanner input = new Scanner(System.in);
        String nim = input.next();
        if(nim.length()!=9){
            throw new Exception("Maaf, format NIM anda salah");
        }
        return nim;
    }
    public double getIPK() throws Exception{
        Scanner input = new Scanner(System.in);
        double ipk = input.nextDouble();
        if(ipk<2.75){
            throw new Exception("Maaf, jumlah SKS anda tidak memenuhi persyaratan");
        }
        if(ipk>4.00){
            throw new Exception("Maaf, IPK tidak boleh melebihi 4.00");
        }
        return ipk;
    }
    public String getNama(){
        Scanner input = new Scanner(System.in);
        String nama = input.next();
        return nama;
    }
}
