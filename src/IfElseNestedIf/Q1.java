package IfElseNestedIf;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz : \nK: Kadın, E: Erkek");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas=scan.nextInt();

        if((cinsiyet=='K'|| cinsiyet=='k')&& yas>=60 ){
            System.out.println("Emekli olabilirsin");
        }else if ((cinsiyet=='K' || cinsiyet=='k')&&yas>=18 ){
            System.out.println("Emekli olmak icin "+(60-yas)+" yil  daha calisman gerekiyor");
        } else if ((cinsiyet=='E' || cinsiyet=='e')&& yas>=65) {
            System.out.println("Emekli olabilirsin");
        }else if ((cinsiyet=='E' || cinsiyet=='e')&&yas>=18 ){
            System.out.println("Emekli olmak icin "+(65-yas)+" yil  daha calisman gerekiyor");
        }else System.out.println("Yasiniz daha çok küçük");


    }
}
