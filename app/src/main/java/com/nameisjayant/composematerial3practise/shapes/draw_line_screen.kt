package com.nameisjayant.composematerial3practise.shapes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun DrawLineScreen() {

//    Canvas(modifier = Modifier.fillMaxSize()){
//        simpleLine()
//    }
    MakeTriangleShape()

}
@Composable
private fun MakeTriangleShape(){
    
    Spacer(modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp).drawWithCache {
        val path = Path()
//        path.moveTo(0F,0f)
//        path.lineTo(size.width/2F,size.height/2F)
//        path.lineTo(size.width,0f)

        // triangle
//        path.moveTo(size.width/2f,0f)
//        path.lineTo(0f,size.height/2f)
//        path.lineTo(size.width,size.height/2f)

        // right triangle
//        path.moveTo(0f,0f)
//        path.lineTo(0f,size.height/2f)
//        path.lineTo(size.width,size.height/2f)

        // rectangle
        path.moveTo(0f,0f)
        path.lineTo(0f,size.height/2f)
        path.lineTo(size.width,size.height/2f)
        path.lineTo(size.width,0f)
        path.close()
        onDrawBehind {
            drawPath(path = path, color = Color.Red, style = Stroke(width = 5f))
        }
    })
    
}

fun DrawScope.simpleLine(){

    val canvasWidth  = size.width
    val canvasHeight = size.height

    drawLine(
        color = Color.Red,
        start = Offset(0f,0f),
        end = Offset(canvasWidth,canvasHeight),
        strokeWidth = 5f,
        pathEffect = PathEffect.dashPathEffect(
            floatArrayOf(10f,20f,30f,40f,50f),50f
        )
    )

}