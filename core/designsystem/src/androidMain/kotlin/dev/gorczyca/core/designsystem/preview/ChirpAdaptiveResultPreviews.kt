package dev.gorczyca.core.designsystem.preview

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import dev.gorczyca.core.designsystem.components.layouts.ChirpAdaptiveResultLayout
import dev.gorczyca.core.designsystem.theme.ChirpTheme

@Composable
@PreviewLightDark
@PreviewScreenSizes
fun ChirpAdaptiveResultLayoutPreview() {
    ChirpTheme {
        ChirpAdaptiveResultLayout(
            modifier = Modifier.fillMaxSize(),
            content = {
                Text(
                    text = "Registration successful!",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        )
    }
}
