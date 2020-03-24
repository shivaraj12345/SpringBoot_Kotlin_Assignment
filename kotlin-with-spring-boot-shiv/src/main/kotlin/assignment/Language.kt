package com.example.countriesdemo

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.xml.bind.annotation.XmlElement


@Entity
@Embeddable
data class Language(
        @JsonProperty( "" )
        @XmlElement( required = true )
    val iso6391: String?="",
    val iso6392: String?="",
    val name: String?="",
    val nativeName: String?=""
)