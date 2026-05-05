package dev.gorczyca.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform