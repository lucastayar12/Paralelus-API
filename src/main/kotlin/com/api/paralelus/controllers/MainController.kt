package com.api.paralelus.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MainController {

    @GetMapping("/")
    fun TesteAPI (): String {
        return "Paralelus API"
    }
}