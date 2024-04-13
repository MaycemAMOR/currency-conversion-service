package com.mytech.microservices.currencyconversionservice.exception;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime timeStamp, String message, String details) {

}