package assignment

import com.example.countriesdemo.Country
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.web.client.RestTemplate
import org.slf4j.LoggerFactory
import assignment.CountryRepository as CountryRepository1


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

    private val log = LoggerFactory.getLogger(Application::class.java)


    @Bean
    fun init(restTemplate: RestTemplate, repository: CountryRepository1) = CommandLineRunner {

      val data =   RestTemplate().getForObject("https://restcountries.eu/rest/v2/all", Country::class.java)

        data.forEach { k ->
            repository.save(Customer(k.name, k.capital,k.region.toLowerCase(),k.cioc,k.currencies.get(0).name,k.languages.get(0).name))
        }

    }
}


/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}




