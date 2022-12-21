package IfElseNestedIf;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin,
        // sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayi= scan.nextInt();

        if(sayi%2!=0)
            if(sayi<0) System.out.println("Sayi negatif tek sayi");
            else System.out.println("Sayi pozitif tek sayi");
        if (sayi%2==0)
            if(sayi%10==0) System.out.println("Sayi 10'un katidir");
            else System.out.println("Sayi 10'un kati degildir");


    }
}
