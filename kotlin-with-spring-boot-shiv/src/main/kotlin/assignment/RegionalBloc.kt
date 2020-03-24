package com.example.countriesdemo



data class RegionalBloc(
    val acronym: String,
    val name: String,
    val otherAcronyms: List<Any>,
    val otherNames: List<String>
)