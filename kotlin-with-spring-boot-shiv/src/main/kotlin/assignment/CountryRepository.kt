package assignment

import org.springframework.data.repository.CrudRepository

interface CountryRepository : CrudRepository<Customer, Long> {

   fun findByregion(region: String): Iterable<Customer>
}