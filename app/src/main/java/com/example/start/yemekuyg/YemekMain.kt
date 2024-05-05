package com.example.start.yemekuyg

fun main() {
    var y1 = Yemekler("melemen","herşeyi karıştır pişir")
    var y2 = Yemekler ("sucuklu yumurta","pişir")
    var y3 = Yemekler("köfte","kıymayı yap pişir")

    var yemekListesi = ArrayList<Yemekler>()
    yemekListesi.add(y1)
    yemekListesi.add(y2)
    yemekListesi.add(y3)
    yemekListesi.add(Yemekler("makarna","su kaynat"))

    var a = yemekListesi.sortedWith(compareBy{it.adi})
    for (i in a){
        i.goster()
        print("\n")
    }
    print("*************\n")
    var b = yemekListesi.filter { it.adi.contains("e") }
    for (i in b){

        i.goster()
        print("\n")
    }
}