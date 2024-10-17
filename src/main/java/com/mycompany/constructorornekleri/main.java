package com.mycompany.constructorornekleri;


public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Ozge Nur", "123456", 1000);
        atm.calis(hesap);
        System.out.println("Programdan cikis yapiliyor...");
    }
    
}
