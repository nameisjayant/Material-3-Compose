package com.nameisjayant.composematerial3practise.shapes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp


class CustomBar : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline =
        Outline.Generic(Path().apply {
            addRoundRect(RoundRect(10f, 10f, 10f, 10f))
        })


}

val shape = GenericShape { size: Size, layoutDirection: LayoutDirection ->
    val width = size.width
    val height = size.height

    addArc(
        oval = Rect(
            offset = Offset.Zero,
            size = Size(height, height)
        ),
        startAngleDegrees = 90f,
        sweepAngleDegrees = 180f,
    )
    lineTo(width, 0f)
    lineTo(width, height)
    lineTo(height, height)

}

@Composable
fun CustomBottomBarShape() {

    // Define your custom color for the bottom bar
    val bottomBarColor = Color.Blue

    // Create a path for the custom shape
    val path = Path().apply {
        // Get the radius for rounded corners
        val cornerRadius = CornerRadius(16f, 16f)

        moveTo(0f, 0f) // Start from top-left corner (start)
        lineTo(0f, 56f) // Draw a line to the bottom-left corner (end)
        lineTo(200f, 56f) // Draw a line to the bottom-right corner (end)
        lineTo(256f, 0f) // Draw a line to the top-right corner (start)
        close() // Close the path to complete the shape
    }

    // Draw the custom bottom bar shape using Canvas
    Canvas(
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth()
    ) {
        drawPath(
            path = path,
            color = bottomBarColor,
            style = Stroke(
                width = 0f, // 0f to fill the shape, non-zero for stroke
                join = StrokeJoin.Round,
                cap = StrokeCap.Round,
                pathEffect = null, // null for solid shape, can be used for dashed lines
                miter = 4f,
            ),
            alpha = 1f
        )
    }

}