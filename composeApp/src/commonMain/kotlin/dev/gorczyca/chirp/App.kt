package dev.gorczyca.chirp

import androidx.compose.runtime.Composable
import dev.gorczyca.chirp.navigation.NavigationRoot
import dev.gorczyca.core.designsystem.theme.ChirpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    ChirpTheme {
        NavigationRoot()
    }
}
