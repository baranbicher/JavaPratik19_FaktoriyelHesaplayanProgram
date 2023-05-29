import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /*

        int n, total= 1;
        System.out.print("Faktoriyel Sayısını Girin: ");
        n= input.nextInt();

        for (int i=1; i<=n ; i++){
            total *= i;
        }
        System.out.println("Faktoriyel Sonucu: " + total);

        */

        int n, r, c, nr, ntotal = 1, rtotal = 1, nrtotal = 1;
        System.out.print("Kombinasyonu Bulmak İçin İlk Sayıyı Girin: ");
        n = input.nextInt();
        System.out.print("İkinci Sayı Girin: ");
        r = input.nextInt();


        for (int i = 1; i <= n; i++) {
            ntotal *= i;
        }
        System.out.println("İlk Sayının Faktöriyeli: " + ntotal);

        for (int i = 1; i <= r; i++) {
            rtotal *= i;
        }
        System.out.println("İkinci Sayının Faktöriyeli: " + rtotal);

        nr = n - r;

        for (int i = 1; i <= nr; i++) {
            nrtotal *= i;
        }
        System.out.println("n-r'nin Faktöriyel Değeri: " + nrtotal);

        c=ntotal/(rtotal*nrtotal);

        System.out.println("Kombinasyon Sonucu: " + c);

        System.out.println("--------cherain---------");


    }
}