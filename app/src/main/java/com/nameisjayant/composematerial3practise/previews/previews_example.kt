package com.nameisjayant.composematerial3practise.previews

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp


@Preview(
//    widthDp = 200,
//    heightDp = 200,
    showBackground = true,
//    showSystemUi = true
    wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_TELEVISION,
    device = "spec:parent=pixel_5,orientation=landscape"
)
@Composable
fun PreviewExample() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Hello world how are you , this is a live editor for compose application")
    }

}