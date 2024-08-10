package com.api.paralelus.repository

import com.api.paralelus.models.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : JpaRepository<Usuario, Long> {
    @Query(value = "select * from usuario where login = ?1 and password = ?2", nativeQuery = true)
    fun findAuthUser(login : String, password : String) : Usuario?

    @Query(value = "select * from usuario where email = ?1 and login = ?2 and password = ?3", nativeQuery = true)
    fun findExistentUser(email : String, login : String, password : String) : Usuario?
}