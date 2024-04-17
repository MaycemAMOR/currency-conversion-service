package com.mytech.microservices.currencyconversionservice;

import com.mytech.microservices.currencyconversionservice.controller.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// definir le service app qu'on doit appeller
//@FeignClient(name = "currency-conversion-service", url = "localhost:8000") // ==> dans le cas d'un appel en local
//@FeignClient(name = "currency-exchange-service")  // ==> dans le cas de load balancer activer avec eureka

//CHANGE-KUBERNETES
//@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_SERVICE_HOST:http://localhost}:8000")
@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_URI:http://localhost}:8000")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
