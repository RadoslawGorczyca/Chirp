package dev.gorczyca.auth.presentation.di

import dev.gorczyca.auth.presentation.email_verification.EmailVerificationViewModel
import dev.gorczyca.auth.presentation.register.RegisterViewModel
import dev.gorczyca.auth.presentation.register_success.RegisterSuccessViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
    viewModelOf(::EmailVerificationViewModel)
}
