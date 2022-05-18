import java.util.Scanner;

public class KdvTutarıHesaplayanProgram {
    public static void main(String[] args) {
        //Kullanıcıdan aldığı ürünün fiyat bilgisini alalım
        double fiyat, kdvOran = 0.18, kdvFiyat, kdvliFiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz");
        fiyat = input.nextDouble();
        kdvFiyat = fiyat * kdvOran;
        kdvliFiyat = kdvFiyat + fiyat;

        System.out.println("kdvsiz fiyat " + fiyat);
        System.out.println("kdv oranı " + kdvOran);
        System.out.println("kdvsiz fiyat " + kdvFiyat);
        System.out.println("kdvsiz fiyat " + kdvliFiyat);
    }
}
