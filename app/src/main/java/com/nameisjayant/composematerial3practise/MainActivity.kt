package com.nameisjayant.composematerial3practise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.nameisjayant.composematerial3practise.bottom_bar.BottomBarScreen
import com.nameisjayant.composematerial3practise.bottom_bar.NavigationRailScreen
import com.nameisjayant.composematerial3practise.bottom_sheet.BottomSheetScaffoldScreen
import com.nameisjayant.composematerial3practise.bottom_sheet.ModalBottomSheetScreen
import com.nameisjayant.composematerial3practise.canvas.CanvasScreen
import com.nameisjayant.composematerial3practise.canvas.DrawLine
import com.nameisjayant.composematerial3practise.components.navigatio_drawer.ModalNavigationDrawerScreen
import com.nameisjayant.composematerial3practise.components.navigatio_drawer.ShimmerEffect
import com.nameisjayant.composematerial3practise.custom_layouts.AnimatingFabContent
import com.nameisjayant.composematerial3practise.gestures.GestureExampleScreen
import com.nameisjayant.composematerial3practise.inspect_layout.InspectLayoutScreen
import com.nameisjayant.composematerial3practise.semantics.SemanticsExampleScreen
import com.nameisjayant.composematerial3practise.shapes.CustomBar
import com.nameisjayant.composematerial3practise.shapes.CustomBottomBarShape
import com.nameisjayant.composematerial3practise.shapes.DrawLineScreen
import com.nameisjayant.composematerial3practise.shapes.DrawRectScreen
import com.nameisjayant.composematerial3practise.shapes.TicketShape
import com.nameisjayant.composematerial3practise.shapes.path
import com.nameisjayant.composematerial3practise.shapes.shape
import com.nameisjayant.composematerial3practise.snackbar.SnackBarScreen
import com.nameisjayant.composematerial3practise.ui.theme.ComposeMaterial3PractiseTheme
import com.nameisjayant.composematerial3practise.window_insets.WindowInsetExample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMaterial3PractiseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier.padding(50.dp)
                    ) {
                        Text(text = "Hello World",
                            color = Color.White,
                            modifier = Modifier
                                .wrapContentSize()
                                .graphicsLayer {
                                    shadowElevation = 8.dp.toPx()
                                    shape = TicketShape(24.dp.toPx())
                                    clip = true
                                }.background(Color.Black)
                                .padding(start = 32.dp, top = 64.dp, end = 32.dp, bottom = 64.dp)

                        )
                    }
                }
            }
        }
    }
}
