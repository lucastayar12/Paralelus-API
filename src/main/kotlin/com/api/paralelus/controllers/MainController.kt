package com.api.paralelus.controllers

import com.api.paralelus.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RestController
@RequestMapping("/")
class MainController {

    @Autowired
    lateinit var usuarioRepository: UsuarioRepository

    @GetMapping("/")
    fun TesteAPI(): String {
        return "Paralelus API"
    }

    @GetMapping("/usuario")
    fun getUsuarios(): ResponseEntity<Any> {
        return ResponseEntity.ok(usuarioRepository.findAll())
    }
}