package com.mycompany.constructorornekleri;

import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza hosgeldiniz...");
        System.out.println("***************************");
        System.out.println("Kullanici Girisi");
        System.out.println("***************************");
        int girisHakki = 3;
        
        
        while (true){
            if (login.login(hesap)){
                System.out.println("Giris Basarili.");
                break;
            }
            else {
                System.out.println("Parola veya kullanici adi yanlis. Tekrar deneyiniz.");
                girisHakki -=1;
                System.out.println("Kalan giris hakki: " +girisHakki);
            }
            if(girisHakki == 0){
                System.out.println("Bankaya girisiniz blokelendi. Lutfen musteri temsilcisine ulasin.");
                return;
            }
        
    }
        System.out.println("***************************");
        String islemler = "1) Bakiye Goruntule\n" 
                          + "2) Para Yatirma \n"
                          +"3) Para Cekme \n"
                          + "4) Cikis icin q'ya basiniz.";
        System.out.println(islemler);
        System.out.println("***************************");
        
        while (true){
            System.out.print("Islem seciniz: ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Cikis yapiliyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz: " +hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.print("Yatirmak istediginiz tutari giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.print("Cekmek istediginiz tutari giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                 hesap.paraCek(tutar);
            }
            else {
                System.out.println("Gecersiz islem. Tekrar deneyiniz.");
            }
            
        }
    }
    
}
