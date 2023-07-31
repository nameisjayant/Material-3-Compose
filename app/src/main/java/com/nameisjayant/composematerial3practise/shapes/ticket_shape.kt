package com.nameisjayant.composematerial3practise.shapes

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp


class TicketShape(private val cornerRadius: Float) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline = Outline.Generic(createCustomPathForTicket(size, cornerRadius))

}

class BottomBarShape(private val cornerRadius: Float) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline = Outline.Generic(createCustomPathForTicket(size, cornerRadius))

}

fun createBottomBarPath(
    size: Size, cornerRadius: Float
): Path = Path().apply {

    reset()


}

fun createCustomPathForTicket(
    size: Size, cornerRadius: Float
): Path = Path().apply {
    reset()
    arcTo(
        rect = Rect(
            left = -cornerRadius,
            top = -cornerRadius,
            right = cornerRadius,
            bottom = cornerRadius
        ),
        forceMoveTo = false,
        sweepAngleDegrees = -90f,
        startAngleDegrees = 90f
    )
    lineTo(x = size.width - cornerRadius, y = 0f)
    arcTo(
        rect = Rect(
            left = size.width - cornerRadius,
            top = -cornerRadius,
            right = size.width + cornerRadius,
            bottom = cornerRadius
        ),
        startAngleDegrees = 180.0f,
        sweepAngleDegrees = -90.0f,
        forceMoveTo = false
    )
    lineTo(x = size.width, y = size.height - cornerRadius)
    // Bottom right arc
    arcTo(
        rect = Rect(
            left = size.width - cornerRadius,
            top = size.height - cornerRadius,
            right = size.width + cornerRadius,
            bottom = size.height + cornerRadius
        ),
        startAngleDegrees = 270.0f,
        sweepAngleDegrees = -90.0f,
        forceMoveTo = false
    )
    lineTo(x = cornerRadius, y = size.height)
    // Bottom left arc
    arcTo(
        rect = Rect(
            left = -cornerRadius,
            top = size.height - cornerRadius,
            right = cornerRadius,
            bottom = size.height + cornerRadius
        ),
        startAngleDegrees = 0.0f,
        sweepAngleDegrees = -90.0f,
        forceMoveTo = false
    )
    lineTo(x = 0f, y = cornerRadius)
    close()
}