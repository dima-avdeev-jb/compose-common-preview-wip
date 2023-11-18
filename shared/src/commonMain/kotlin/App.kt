@file:OptIn(ExperimentalResourceApi::class)

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun App() {
    UsageOfCommonPreview()
}

@Preview
@Composable
fun UsageOfCommonPreview() {
    Column {
        Text("This is commonMain Composable function")
        Text("Platform: ${getPlatformName()}")
        Image(
            painterResource("compose-multiplatform.xml"),
            contentDescription = "This is image resource"
        )
    }
}

expect fun getPlatformName(): String
