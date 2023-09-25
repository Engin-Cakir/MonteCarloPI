package interface_example01;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        ICustomerDal iCustomerDal = new OracleCustomerDal();

//Tekrar
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int girilenSayi = scanner.nextInt();
        if (girilenSayi > 15) {
            System.out.println("sayi 15'den büyük...");
        }

    }
}
