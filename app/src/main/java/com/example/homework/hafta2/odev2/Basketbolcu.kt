package com.example.homework.hafta2.odev2

class Basketbolcu(boy:Int, yas:Int, var kullandigiEl:String): Oyuncu(boy,yas) {

    fun oynaBasketbolcu(){
        println("Boy: $boy")
        println("Yaşı: $yas")
        println("Kullandığı El: $kullandigiEl")
    }
}
