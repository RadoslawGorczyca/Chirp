package dev.gorczyca.core.data.di

import dev.gorczyca.core.data.auth.KtorAuthService
import dev.gorczyca.core.data.logging.KermitLogger
import dev.gorczyca.core.data.networking.HttpClientFactory
import dev.gorczyca.core.domain.auth.AuthService
import dev.gorczyca.core.domain.logging.ChirpLogger
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformCoreDataModule: Module

val coreDataModule = module {
    includes(platformCoreDataModule)
    single<ChirpLogger> { KermitLogger }
    single {
        HttpClientFactory(get()).create(get())
    }
    singleOf(::KtorAuthService) bind AuthService::class
}
