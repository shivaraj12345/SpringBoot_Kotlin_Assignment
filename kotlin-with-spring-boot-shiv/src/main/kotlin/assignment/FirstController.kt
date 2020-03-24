package assignment

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Our very first controller
 */



@RestController
class FirstController {


    @Autowired //don't forget the setter
     val repository: CountryRepository? = null


    @GetMapping("/country")
   fun getAll() = repository?.findAll()


    @GetMapping("/country/countryNames")
    fun getCountryNames(): ArrayList<String> {
       val data =  repository?.findAll()
        val list: ArrayList<String> = ArrayList()

        data?.forEach { k ->
            list.add(k.name)
        }
        return list
    }

    @GetMapping("/country/{region}")
    fun findByRegion(@PathVariable region:String)
            = repository?.findByregion(region.toLowerCase())


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
