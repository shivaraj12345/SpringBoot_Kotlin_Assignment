package tutorial

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Value(var id: Long = 0, var quote: String = "")