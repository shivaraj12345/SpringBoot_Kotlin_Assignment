package assignment

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

/**
 * Representation of a User
 * @property username The username of the user
 * @property screenName The screen name of the user
 * @property email The email address of the user
 * @property registered When the user registered with us
 */
import javax.xml.bind.annotation.XmlElement

@Entity
data class Customer(

        @JsonProperty( "" )
        @XmlElement( required = true )
        val name: String="",
        val capital:String="",
        val region:String="",
        val cioc:String?="",
        val currencies: String?="",
        val languages: String?="",
        @Id @GeneratedValue
        val Id: Long = -1
)

