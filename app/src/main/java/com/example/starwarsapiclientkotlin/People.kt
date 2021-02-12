package com.example.starwarsapiclientkotlin

data class People(
        var name: String? = "",
        var height: Int? = 0,
        var mass: Int? = 0,
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