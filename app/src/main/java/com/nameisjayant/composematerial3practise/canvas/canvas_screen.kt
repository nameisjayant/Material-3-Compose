package com.nameisjayant.composematerial3practise.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.DefaultStrokeLineMiter
import androidx.compose.ui.unit.dp


@Composable
fun CanvasScreen() {
    DrawLine()
}

@Composable
fun DrawLine() {

    Canvas(modifier = Modifier) {
        drawLine(
            color = Color.Red,
            start = Offset(size.width / 2f, 0f),
            end = Offset(0F, size.height / 2f),
            strokeWidth = 4f
        )
    }

}

@Composable
fun DrawCircle() {

    Canvas(modifier = Modifier.padding(horizontal = 10.dp)) {
        drawCircle(
            color = Color.Red,
            radius = size.minDimension / 4f,
            // center = Offset(0f, 0f),
            //alpha = 0.5f,
            style = Stroke(
                width = 5.0f
            )
        )
    }

}

@Composable
fun DrawRectangle() {

    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(
            color = Color.Red,
            size = size / 5F,
            topLeft = Offset(100f, 100f),
            style = Stroke(
                width = 5.0f,
                cap = StrokeCap.Round
            )
        )
    }
}