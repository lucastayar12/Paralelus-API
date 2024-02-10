package com.api.paralelus.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Table(name = "usuario")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Usuario() {
    @Id
    var id: Long = 0
    lateinit var login: String
    lateinit var senha: String
    lateinit var email: String
}