package com.nameisjayant.composematerial3practise.shapes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke


@Composable
fun DrawRectScreen() {

    Canvas(modifier = Modifier.fillMaxSize()){
        drawRectangular()
    }

}

private fun DrawScope.drawRectangular(){
    val canvasSize = size/2f
    drawRect(
        color = Color.Red,
        size = canvasSize,
        alpha = 1.0f,
        style = Stroke(
            width = 5f,
            miter = 3f,
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f,20f),25f)
        ),
        topLeft = Offset(100f,100f),
    )
}