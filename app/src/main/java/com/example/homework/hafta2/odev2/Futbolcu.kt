package com.example.homework.hafta2.odev2

class Futbolcu(boy:Int, yas:Int, var kullandigiAyak: String): Oyuncu(boy, yas) {
    fun oynaFutbolcu(){
        println("Boy: $boy")
        println("Yaşı: $yas")
        println("Kullandığı Ayak: $kullandigiAyak")
    }
}