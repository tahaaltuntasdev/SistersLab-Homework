package com.example.homework.hafta1.odev2

import java.util.Scanner

fun main() {

    println("Yaşınızı Giriniz")
    val scanner1 = Scanner(System.`in`)
    val age = scanner1.next()


    try {
        if (age.toInt() >= 18) {
            println("Oy Kullanabilirsiniz!")
        } else if (age.toInt() < 18 && age.toInt() >= 0) {
            println("Oy Kullanamazsınız!")
        } else {
            println("Geçerli Bir Yaş Giriniz!")
        }
    } catch (e: NumberFormatException) {
        println("Sayı Giriniz!")
    }
}