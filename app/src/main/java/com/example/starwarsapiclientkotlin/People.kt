package com.example.starwarsapiclientkotlin

data class People(
        var name: String? = "",
        var height: String? = "",
        var mass: String? = "",
        var hair_color: String? = "",
        var skin_color: String? = "",
        var eye_color: String? = "",
        var birth_year: String? = "",
        var gender: String? = "",
        var homeworld: String? = "",
        var films: List<String>? = arrayListOf(),
        var species: List<String>? = arrayListOf(),
        var starships: List<String>? = arrayListOf(),
        var url: String? = "",
        var created: String? = "",
        var edited: String? = ""
) {
}