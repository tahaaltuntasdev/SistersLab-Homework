package com.example.homework.hafta2.odev1

class Dikdortgen (var kisaKenar: Int, var uzunKenar: Int): GeometrikSekil(){

    fun dikdortgenAlan(){
        val alan = kisaKenar*uzunKenar
        println("Dikdörtgenin alanı: $alan")
    }

    fun dikdortgenCevre(){
        val cevre = (kisaKenar+uzunKenar)*2
        println("Dikdörtgenin çevresi: $cevre")
    }
}