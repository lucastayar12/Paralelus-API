package com.api.paralelus

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParalelusApplication

fun main(args: Array<String>) {
	val logger = LoggerFactory.getLogger(ParalelusApplication::class.java)

	runApplication<ParalelusApplication>(*args)
	logger.info(">>>>>>>>>>>>> Aplicação Iniciada")
	logger.info(">>>>>>>>>>>>> Versão 1.0")

}
