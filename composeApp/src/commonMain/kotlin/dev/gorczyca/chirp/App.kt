package dev.gorczyca.chirp

import androidx.compose.runtime.Composable
import dev.gorczyca.auth.presentation.register_success.RegisterSuccessRoot
import dev.gorczyca.core.designsystem.theme.ChirpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    ChirpTheme {
        RegisterSuccessRoot(

        )
    }
}
