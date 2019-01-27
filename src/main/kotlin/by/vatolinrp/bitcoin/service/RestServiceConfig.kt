package by.vatolinrp.bitcoin.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RestServiceConfig

fun main(args: Array<String>) {
    System.getProperties()["server.port"] = 8081
    SpringApplication.run(RestServiceConfig::class.java, *args)
}
