package IfElseNestedIf;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen günü giriniz : \n 1:Pazartesi, 2:Sali , 3: Carsamba , 4: Persembe" +
                " 5: Cuma , 6: Cumartesi , 7: Pazar");
        int gun= scan.nextInt();
        if(gun<=5 && gun>0)
            System.out.println("tatile "+(5-gun)+ "  gun var");
        else if(gun>=6 && gun<8 )
            System.out.println("Zaten tatildesin");
    }
}
