package com.example.routes

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/"){
        call.respond(
            message = "Welcome to My Android Book API!",
            status = HttpStatusCode.OK
        )
    }
}