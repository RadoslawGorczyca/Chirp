package dev.gorczyca.auth.presentation.register_success

sealed interface RegisterSuccessEvent {
    data object ResendVerificationEmailSuccess: RegisterSuccessEvent
}
