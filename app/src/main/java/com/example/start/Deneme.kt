package com.example.start



fun main() {
    val isim = "enes"
    kacE(isim)

}

fun kacE(kelime:String){
    var sayac = 0
    for (i in 0..kelime.lastIndex){
        if(kelime[i] == 'e' || kelime[i] == 'E'){
            sayac++
        }
    }
    print("$sayac tane e var")
}