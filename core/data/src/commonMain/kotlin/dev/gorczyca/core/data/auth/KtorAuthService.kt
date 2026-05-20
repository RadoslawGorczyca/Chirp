package dev.gorczyca.core.data.auth

import dev.gorczyca.core.data.dto.requests.RegisterRequest
import dev.gorczyca.core.data.networking.post
import dev.gorczyca.core.domain.auth.AuthService
import dev.gorczyca.core.domain.util.DataError
import dev.gorczyca.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class KtorAuthService(
    private val httpClient: HttpClient
) : AuthService {
    override suspend fun register(
        email: String,
        username: String,
        password: String
    ): EmptyResult<DataError.Remote> {
        return httpClient.post(
            route = "/auth/register",
            body = RegisterRequest(
                email = email,
                username = username,
                password = password,
            )
        )
    }

}
