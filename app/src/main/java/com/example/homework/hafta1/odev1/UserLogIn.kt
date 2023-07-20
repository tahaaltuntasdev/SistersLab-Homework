package com.example.homework.hafta1.odev1

import java.util.Scanner

fun main() {

    val userName = "Taha"
    val password = "taha123"

    println("Kullanıcı Adınızı Giriniz")
    val scanner1 = Scanner(System.`in`)
    val userNameScanner = scanner1.nextLine()

    println("Şifrenizi Giriniz")
    val scanner2 = Scanner(System.`in`)
    val passwordScanner = scanner2.nextLine()

    if(userNameScanner.equals(userName , true)  && passwordScanner.equals(password, false)){
        println("Girişiniz Başarılı!")
    }else{
        println("Kullanıcı Adı Veya Şifre Hatalı!")
    }
}