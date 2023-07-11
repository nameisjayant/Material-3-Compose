package com.nameisjayant.composematerial3practise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.nameisjayant.composematerial3practise.bottom_bar.BottomBarScreen
import com.nameisjayant.composematerial3practise.bottom_bar.NavigationRailScreen
import com.nameisjayant.composematerial3practise.bottom_sheet.BottomSheetScaffoldScreen
import com.nameisjayant.composematerial3practise.bottom_sheet.ModalBottomSheetScreen
import com.nameisjayant.composematerial3practise.canvas.CanvasScreen
import com.nameisjayant.composematerial3practise.components.navigatio_drawer.ModalNavigationDrawerScreen
import com.nameisjayant.composematerial3practise.components.navigatio_drawer.ShimmerEffect
import com.nameisjayant.composematerial3practise.custom_layouts.AnimatingFabContent
import com.nameisjayant.composematerial3practise.gestures.GestureExampleScreen
import com.nameisjayant.composematerial3practise.inspect_layout.InspectLayoutScreen
import com.nameisjayant.composematerial3practise.semantics.SemanticsExampleScreen
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
                    ShimmerEffect()
                }
            }
        }
    }
}
