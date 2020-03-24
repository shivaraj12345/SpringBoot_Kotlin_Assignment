package tutorial

import com.example.countriesdemo.*
import org.springframework.web.bind.annotation.*

/**
 * Our very first controller
 */
@RestController
class FirstController {
    /** The ultimate answer to life, the universe and everything */
    @RequestMapping("/answer")
    fun answer() = 46

    /** Get the details of a user */
    @RequestMapping("/user")
    fun getUser() : Quote {
        val user = Quote()
        return user
    }


    @RequestMapping("/country")
    fun getCountry():Country{
        val data = getCountry()
        return data
    }

//  /** Get the details of a countryItems */
     @RequestMapping("/countryItems")
     fun getCountries() : CountryItem {
         val  countryItems = CountryItem(
//      alpha2Code =  "alpha2Code",
//      alpha3Code =  "alpha3Code",
//      altSpellings  = "altSpellings",
//      area= 0.0,
//      borders= "",
//      callingCodes = "",
      capital="",
//      cioc= "cioc",
//      currencies = "",
//      demonym="demonym",
//      flag= "flag",
//      gini = 0.0,
//      languages = "",
//      latlng = "",
      name = "",
//      nativeName = "nativeName",
//      numericCode = "numericCode",
//      population = 0,
        region = ""
//      regionalBlocs= "",
//      subregion = "subregion",
//      timezones= "",
//      topLevelDomain="",
//      translations= ""
 )
         return countryItems
     }
    
    /**
     * Perform some string manipulation on the given value
     * @param value The value to manipulate
     * @param operation The operation to perform
     */
    @RequestMapping("/string/{value}")
    fun manipulateString(@PathVariable("value") value: String,
                         @RequestParam(name = "operation", defaultValue = "none") operation: String) : String {
        return when (operation.toUpperCase()) {
            "REVERSE" -> value.reversed()
            "UPPER" -> value.toUpperCase()
            "LOWER" -> value.toLowerCase()
            else -> value
        }
    }
}
