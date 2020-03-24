package com.example.countriesdemo

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*
import javax.xml.bind.annotation.XmlElement


@Entity
data class CountryItem (

        val name: String="",
        val capital:String="",
        val region:String="",
        val cioc:String?="",
        val currencies: List<Currency>,
        val languages: Array<Language>

)