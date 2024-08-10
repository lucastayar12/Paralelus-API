package com.api.paralelus.controllers

import com.api.paralelus.models.Usuario
import com.api.paralelus.repository.UsuarioRepository
import com.api.paralelus.service.dto.LoginDTO
import com.api.paralelus.service.dto.ResponseDTO
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RestController
@RequestMapping("/auth")
class AuthController {

    var log: Logger = LoggerFactory.getLogger(AuthController::class.java)

    @Autowired
    lateinit var usuarioRepository: UsuarioRepository

    @PostMapping("/login")
    fun login(@RequestBody loginBody : LoginDTO): ResponseEntity<Boolean> {
        log.info("Entrei método login");
        val userAuthorized = usuarioRepository.findAuthUser(loginBody.login, loginBody.senha) != null
        return ResponseEntity.ok(userAuthorized);
    }

    @PostMapping("/registrar")
    fun registrar(@RequestBody user: Usuario) : ResponseEntity<Any> {
        log.info("Entrei método registrar");
        val userExist = usuarioRepository.findExistentUser(user.email, user.login, user.senha) != null
        if (userExist)
            return ResponseEntity.ok(ResponseDTO(false, "Usuário ja existe"));
        else
        {
            usuarioRepository.save(user)
            return ResponseEntity.ok(ResponseDTO(true, "Usuário criado"));
        }

    }
}