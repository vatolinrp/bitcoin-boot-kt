package by.vatolinrp.bitcoin.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BitcoinPriceRestController {

    @GetMapping("/ping")
    fun ping() = Ping("Active")
}
