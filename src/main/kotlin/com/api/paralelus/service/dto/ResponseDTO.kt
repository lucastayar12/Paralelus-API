package com.api.paralelus.service.dto

import lombok.AllArgsConstructor

@AllArgsConstructor
data class ResponseDTO(
    var success: Boolean = false,
    var message: String = ""
)