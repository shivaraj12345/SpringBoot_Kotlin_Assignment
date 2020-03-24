package com.example.countriesdemo

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*
import javax.xml.bind.annotation.XmlElement


@Entity
@Embeddable
data class Currency(
        @JsonProperty( "" )
        @XmlElement( required = true )
        val code: String?="",
        val name: String?="",
        val symbol: String?="",
        @Id @GeneratedValue
        val Id: Long = -1
)