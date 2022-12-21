package IfElseNestedIf;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz : ");
        int urunAdedi= scan.nextInt();
        System.out.println("Lutfen fiyati giriniz : ");
        double listeFiyati= scan.nextDouble();
        System.out.println("Musteri kartiniz var mi \n E:Evet H:Hayir");
        char kart=scan.next().charAt(0);
        if(kart=='E' && urunAdedi>10)
            System.out.println("%20 indirimli fiyati : "+(urunAdedi*listeFiyati*0.8));
        else if (kart=='E' && urunAdedi<10) {
            System.out.println("%15 indirimli fiyati : "+(urunAdedi*listeFiyati*0.85));
        } else if (kart=='H' && urunAdedi>10 ) {
            System.out.println("%15 indirimli fiyati : "+(urunAdedi*listeFiyati*0.85));
        } else if (kart=='H' && urunAdedi<10) {
            System.out.println("%10 indirimli fiyati : "+(urunAdedi*listeFiyati*0.9));
        }else System.out.println("Hatali giris ");
    }
}
