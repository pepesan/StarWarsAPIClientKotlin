package com.example.starwarsapiclientkotlin

data class PeopleList(
    var count: Int? = 0,
    var next: String? = "",
    var previous: String? = "",
    var result: List<People>? = ArrayList<People>()
) {
}