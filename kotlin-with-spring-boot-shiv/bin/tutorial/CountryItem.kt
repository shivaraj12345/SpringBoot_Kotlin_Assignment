package com.example.countriesdemo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import javax.xml.bind.annotation.XmlElement


@JsonIgnoreProperties(ignoreUnknown = true)
data class CountryItem(
//    val alpha2Code: String,
//    val alpha3Code: String,
//    val altSpellings: List<String>,
//    val area: Double,
//    val borders: List<String>,
//    val callingCodes: List<String>,
//    val cioc: String,
//    val currencies: List<Currency>,
//    val demonym: String,
//    val flag: String,
//    val gini: Double,
//    val languages: List<Language>,
//    val latlng: List<Double>,
//    val name: String,
//    val capital: String,
//    val region: String,
//    val nativeName: String,
//    val numericCode: String,
//    val population: Int,
//    val regionalBlocs: List<RegionalBloc>,
//    val subregion: String,
//    val timezones: List<String>,
//    val topLevelDomain: List<String>,
//    val translations: Translations


        @JsonProperty( "" )
        @XmlElement( required = true )
        val name: String,
        val capital:String,
        val region:String
//        val alpha2Code: String,
//        val alpha3Code: String,
//        val altSpellings: String,
//        val area: Double,
//        val borders: String,
//        val callingCodes:String,
//        val cioc: String,
//        val currencies: String,
//        val demonym: String,
//        val flag: String,
//        val gini: Double,
//        val languages: String,
//        val latlng:String,
//        val name: String,
//        val capital: String,
//        val region: String,
//        val nativeName: String,
//        val numericCode: String,
//        val population: Int,
//        val regionalBlocs: String,
//        val subregion: String,
//        val timezones: String,
//        val topLevelDomain:String,
//        val translations: String
)