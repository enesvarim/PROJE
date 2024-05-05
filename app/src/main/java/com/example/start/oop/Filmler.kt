package com.example.start.oop

data class Filmler(var film_id:Int,
                   var film_adi:String,
                   var film_yili:Int,
                   var katogori: Katogori,
                   var yonetmen: Yonetmen) {
    fun goster(){
        print("film id  = $film_id\nfilm adi = $film_adi\nfilm yili = $film_yili\n" +
                "film katogorisi = ${katogori.katogori_adi}\n" +
                "film yönetmeni = ${yonetmen.yönetmen_Adi}")
    }
}