package com.example.homework.hafta2.odev3

class Personel(var ad:String, var soyadi:String, var pozisyon: String, var maas: Int) {
    fun maasArttir(){
        maas += 2500
        println("Ad: $ad")
        println("Soyad: $soyadi")
        println("Pozisyonu: $pozisyon")
        println("Maaş: $maas")
    }
}