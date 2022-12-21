package IfElseNestedIf;

import java.util.Scanner;

public class Q5Nested {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz : \nK: Kadın, E: Erkek");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas=scan.nextInt();
        if(cinsiyet=='K' || cinsiyet=='k'){
            if (yas>60) System.out.println("Emekli olabilirsin");
            else if(yas<60) System.out.println("Emekli olmak icin "+(60-yas)+ " yil daha çalısmaniz gerekiyor");
        }else if (cinsiyet=='E'|| cinsiyet=='e' ) {
            if(yas>65) System.out.println("Emekli olabilirsin");
            else if (yas<65) System.out.println("Emekli olmak icin "+(65-yas)+ " yil daha çalısmaniz gerekiyor");
        }else System.out.println("Hatali giris");


    }
}
