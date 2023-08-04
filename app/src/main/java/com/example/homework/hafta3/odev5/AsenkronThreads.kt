package com.example.homework.hafta3.odev5

val firstThread = Thread {
    for (i in 100..199){
        println("Birinci Thread: $i")
        Thread.sleep(5000)
    }
}

val secondThread = Thread {
    for (i in 200..299){
        println("İkinci Thread: $i")
        Thread.sleep(3000)
    }
}

fun main(){

    val birinciThread = firstThread
    birinciThread.start()

    val ikinciThread = secondThread
    ikinciThread.start()

    for (i in 900..999) {
        println("Main Thread: $i")
        Thread.sleep(6000)

    }


}

