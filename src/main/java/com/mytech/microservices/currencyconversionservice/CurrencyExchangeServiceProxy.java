package com.mytech.microservices.currencyconversionservice;

import com.mytech.microservices.currencyconversionservice.controller.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-conversion-service", url = "localhost:8000")
@FeignClient(name = "currency-exchange-service") // definir le service app qu'on doit appeller
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
