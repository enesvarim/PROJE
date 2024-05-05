package com.example.start.yemekuyg

class Yemekler(var adi:String,
               var tarif:String) {
    fun goster(){
        print("yemek adi = {$adi}     tarif = {$tarif}")
    }
}