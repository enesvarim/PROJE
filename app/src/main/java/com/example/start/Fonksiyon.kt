package com.example.start

class Fonksiyon() {
    fun kacE(kelime:String){
        var sayac = 0
        for (i in 0..3){
            if(kelime[i] == 'e' || kelime[i] == 'E'){
                sayac++
            }
        }
        print("$sayac tane e var")
    }
}