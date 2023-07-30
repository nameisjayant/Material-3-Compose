package com.nameisjayant.composematerial3practise.shapes

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection


/*
-- path
-- shape
 */

val path = Path()
val drawPath = path.cubicTo(x1 = 0f, x2 = 2f, x3 = 5f, y1 = 6f, y2 = 3f, y3 = 9f)

@Composable
fun DrawPath() {

    Canvas(modifier = Modifier){
        drawPath(
            path = path,
            color = Color.Red,
            alpha = 0.2f
        )
    }

}

class CustomShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        TODO("Not yet implemented")
    }

}

