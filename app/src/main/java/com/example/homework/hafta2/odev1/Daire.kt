package com.example.homework.hafta2.odev1

class Daire(var yariCap: Int, var piSayisi: Int=3): GeometrikSekil() {

    fun daireAlan(){
        val alan = piSayisi*yariCap*yariCap
        println("Dairenin alanı: $alan")
    }

    fun daireninCevresi(){
        val cevre = 2*piSayisi*yariCap
        println("Dairenin çevresi: $cevre")
    }
}