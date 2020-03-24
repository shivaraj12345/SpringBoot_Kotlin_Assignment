package tutorial

import com.example.countriesdemo.Country
import com.example.countriesdemo.CountryItem
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.core.JsonGenerator
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.web.client.RestTemplate
import java.io.File
import com.fasterxml.jackson.databind.ObjectMapper





/**
 * The main entry point to the application
 */
@EnableAutoConfiguration
@Configuration
internal class Application {
    @Bean
    fun controller() = FirstController()

    @Bean
    fun restTemplate(builder: RestTemplateBuilder): RestTemplate {
        return builder.build()
    }



    @Bean
    fun init(restTemplate: RestTemplate) = CommandLineRunner {

        val data =   RestTemplate().getForObject("https://restcountries.eu/rest/v2/all", Country::class.java)
      //  val data = RestTemplate().getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote::class.java)
        println(data)
    }
}


/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}




