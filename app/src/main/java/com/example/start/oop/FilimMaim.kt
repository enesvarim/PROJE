package com.example.start.oop

import java.util.Scanner

fun main() {
    val y1 = Yonetmen(1,"CEM YILMAZ")
    val y2 = Yonetmen(2,"ENES VARIM")

    val k1 = Katogori(1,"KOMEDİ")
    val K2 = Katogori(2,"AKSİYON")

    val f1 = Filmler(1,"GORA",2008,k1,y1)
    f1.goster()
    
}