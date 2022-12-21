package IfElseNestedIf;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Km olarak mesafeyi giriniz : ");
        double mesafe= scan.nextDouble();
        System.out.println("Lutfen cevirmek istediginiz birimi giriniz :\nmetre , santimetre");
        String birim= scan.next();
        if(birim.equalsIgnoreCase("metre"))
            System.out.println("Verilen mesafenin metre karsiligi : "+(mesafe*1000));
        else if (birim.equalsIgnoreCase("Santimetre"))
            System.out.println("Verilen mesafenin santimetre karsiligi : "+(mesafe*100000));
        else System.out.println("Hatali giris ");
        }
    }

