package dev.gorczyca.core.domain.auth

import dev.gorczyca.core.domain.util.DataError
import dev.gorczyca.core.domain.util.EmptyResult

interface AuthService {
    suspend fun register(
        email: String,
        username: String,
        password: String,
    ): EmptyResult<DataError.Remote>
}
