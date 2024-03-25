/**
 * Copyright (c) 2024 Vitor Pamplona
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the
 * Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN
 * AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.vitorpamplona.amethyst.commons.hashtags

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CustomHashTagIconsWeedPreview() {
    Image(
        painter =
            rememberVectorPainter(
                CustomHashTagIcons.Weed,
            ),
        contentDescription = "",
    )
}

public val CustomHashTagIcons.Weed: ImageVector
    get() {
        if (customHashTagIconsWeed != null) {
            return customHashTagIconsWeed!!
        }
        customHashTagIconsWeed =
            Builder(
                name = "Weed",
                defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp,
                viewportWidth = 512.0f,
                viewportHeight = 512.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF00bf00)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveToRelative(255.539f, 30.66f)
                    curveToRelative(-170.359f, -0.44f, -85.18f, -0.22f, 0.0f, 0.0f)
                    close()
                    moveTo(255.561f, 30.641f)
                    curveToRelative(-0.16f, 1.3f, -0.7f, 4.54f, -1.51f, 8.92f)
                    curveToRelative(-1.56f, 8.54f, -4.271f, 21.57f, -7.781f, 33.9f)
                    curveToRelative(-0.86f, 3.08f, -1.949f, 6.49f, -3.189f, 10.27f)
                    curveToRelative(-0.002f, 0.006f, -0.004f, 0.014f, -0.006f, 0.02f)
                    lineToRelative(-0.035f, -0.029f)
                    lineToRelative(-2.158f, -1.891f)
                    lineToRelative(-1.512f, 12.869f)
                    curveToRelative(-0.943f, 3.119f, -2.055f, 6.243f, -2.889f, 8.881f)
                    curveToRelative(-0.001f, 0.002f, -0.001f, 0.004f, -0.002f, 0.006f)
                    lineToRelative(-0.029f, -0.016f)
                    lineToRelative(-7.35f, -3.73f)
                    lineToRelative(1.68f, 21.52f)
                    lineToRelative(0.006f, 0.066f)
                    curveToRelative(-1.345f, 4.473f, -2.691f, 9.104f, -4.035f, 13.895f)
                    lineToRelative(-0.02f, -0.01f)
                    lineToRelative(-8.65f, -3.84f)
                    lineToRelative(2.699f, 28.379f)
                    lineToRelative(0.008f, 0.088f)
                    curveToRelative(-0.644f, 2.949f, -1.232f, 5.955f, -1.768f, 9.012f)
                    curveToRelative(-0.0f, 0.001f, 0.0f, 0.003f, 0.0f, 0.004f)
                    lineToRelative(-0.029f, -0.014f)
                    lineToRelative(-11.25f, -5.779f)
                    lineToRelative(7.189f, 35.09f)
                    lineToRelative(0.031f, 0.148f)
                    curveToRelative(-0.373f, 4.064f, -0.644f, 8.231f, -0.861f, 12.451f)
                    curveToRelative(-0.0f, 0.006f, 0.0f, 0.013f, 0.0f, 0.02f)
                    lineToRelative(-0.029f, -0.02f)
                    lineToRelative(-12.221f, -8.109f)
                    lineToRelative(13.189f, 51.629f)
                    curveToRelative(0.298f, 2.798f, 0.545f, 5.692f, 0.791f, 8.111f)
                    curveToRelative(0.001f, 0.005f, 0.001f, 0.009f, 0.002f, 0.014f)
                    lineToRelative(-0.031f, -0.014f)
                    lineToRelative(-6.381f, -2.65f)
                    lineToRelative(-7.57f, -3.189f)
                    lineToRelative(15.887f, 32.271f)
                    lineToRelative(-0.025f, 0.049f)
                    lineToRelative(-1.5f, 2.836f)
                    curveToRelative(-1.187f, -1.945f, -2.424f, -3.881f, -3.721f, -5.826f)
                    curveToRelative(-0.028f, -0.043f, -0.06f, -0.088f, -0.088f, -0.131f)
                    lineToRelative(-18.043f, -39.051f)
                    lineToRelative(-2.91f, 10.348f)
                    curveToRelative(-2.206f, -2.645f, -4.473f, -5.291f, -6.689f, -7.826f)
                    curveToRelative(-0.022f, -0.025f, -0.044f, -0.047f, -0.066f, -0.072f)
                    lineToRelative(-13.414f, -25.969f)
                    lineToRelative(-3.557f, 8.402f)
                    curveToRelative(-1.887f, -1.837f, -3.725f, -3.555f, -5.563f, -5.232f)
                    curveToRelative(-4.205f, -6.524f, -8.374f, -13.106f, -12.551f, -19.66f)
                    lineToRelative(-3.02f, 6.09f)
                    curveToRelative(-3.19f, -2.65f, -6.32f, -5.14f, -9.35f, -7.52f)
                    curveToRelative(-0.016f, -0.013f, -0.031f, -0.022f, -0.047f, -0.035f)
                    lineTo(127.5f, 190.609f)
                    lineToRelative(-2.262f, 5.441f)
                    curveToRelative(-2.16f, -1.62f, -4.209f, -3.191f, -6.158f, -4.65f)
                    curveToRelative(-0.032f, -0.024f, -0.058f, -0.043f, -0.09f, -0.066f)
                    lineToRelative(-7.17f, -7.703f)
                    lineToRelative(-0.318f, 2.143f)
                    curveToRelative(-2.537f, -1.997f, -4.864f, -3.775f, -6.912f, -5.453f)
                    curveToRelative(-12.32f, -10.06f, -24.38f, -21.901f, -26.65f, -24.221f)
                    curveToRelative(1.62f, 2.81f, 9.73f, 17.511f, 16.0f, 31.951f)
                    curveToRelative(1.03f, 2.38f, 2.111f, 5.03f, 3.301f, 8.0f)
                    curveToRelative(0.001f, 0.003f, 0.003f, 0.007f, 0.004f, 0.01f)
                    lineToRelative(-2.104f, -0.32f)
                    lineToRelative(5.398f, 8.742f)
                    curveToRelative(0.87f, 2.32f, 1.841f, 4.808f, 2.871f, 7.348f)
                    curveToRelative(0.002f, 0.006f, 0.005f, 0.013f, 0.008f, 0.02f)
                    lineToRelative(-6.059f, 0.6f)
                    lineToRelative(11.68f, 13.352f)
                    curveToRelative(1.398f, 3.504f, 2.965f, 7.176f, 4.691f, 10.898f)
                    curveToRelative(0.003f, 0.007f, 0.007f, 0.014f, 0.01f, 0.022f)
                    lineToRelative(-6.871f, 1.029f)
                    lineToRelative(15.73f, 17.57f)
                    lineToRelative(0.023f, 0.027f)
                    curveToRelative(1.073f, 2.204f, 2.205f, 4.347f, 3.387f, 6.602f)
                    curveToRelative(0.004f, 0.007f, 0.008f, 0.013f, 0.012f, 0.02f)
                    lineToRelative(-0.012f, 0.002f)
                    lineToRelative(-9.25f, 0.809f)
                    lineToRelative(21.68f, 20.17f)
                    lineToRelative(0.057f, 0.053f)
                    curveToRelative(1.768f, 2.835f, 3.701f, 5.623f, 5.684f, 8.469f)
                    curveToRelative(0.005f, 0.007f, 0.011f, 0.013f, 0.016f, 0.02f)
                    horizontalLineToRelative(-0.025f)
                    lineToRelative(-11.029f, -0.27f)
                    lineToRelative(33.199f, 28.379f)
                    lineToRelative(0.125f, 0.105f)
                    curveToRelative(1.465f, 1.62f, 2.939f, 3.25f, 4.404f, 4.822f)
                    verticalLineToRelative(0.002f)
                    verticalLineToRelative(0.111f)
                    lineToRelative(0.006f, 0.051f)
                    lineToRelative(-7.676f, 1.34f)
                    lineToRelative(-0.059f, -0.041f)
                    lineToRelative(-30.221f, -20.92f)
                    lineToRelative(2.971f, 8.33f)
                    lineToRelative(0.002f, 0.006f)
                    curveToRelative(-0.004f, -0.002f, -0.008f, -0.004f, -0.012f, -0.006f)
                    curveToRelative(-3.021f, -1.296f, -6.043f, -2.532f, -9.004f, -3.719f)
                    lineToRelative(-0.018f, -0.012f)
                    lineToRelative(-22.979f, -14.811f)
                    lineToRelative(1.51f, 7.031f)
                    curveToRelative(-2.27f, -0.75f, -4.481f, -1.46f, -6.701f, -2.16f)
                    lineToRelative(-19.25f, -10.541f)
                    lineToRelative(0.76f, 5.24f)
                    curveToRelative(-3.73f, -0.98f, -7.3f, -1.89f, -10.76f, -2.76f)
                    lineToRelative(-14.65f, -7.789f)
                    lineToRelative(0.971f, 4.6f)
                    curveToRelative(-2.38f, -0.6f, -4.7f, -1.08f, -6.92f, -1.57f)
                    curveToRelative(-0.024f, -0.006f, -0.043f, -0.01f, -0.066f, -0.016f)
                    lineToRelative(-9.174f, -3.484f)
                    lineToRelative(0.799f, 1.549f)
                    curveToRelative(-2.915f, -0.649f, -5.502f, -1.3f, -7.879f, -1.889f)
                    curveToRelative(-14.255f, -3.676f, -29.14f, -8.685f, -32.033f, -9.723f)
                    curveToRelative(-0.486f, -0.278f, -0.595f, -0.337f, -0.256f, -0.117f)
                    curveToRelative(-0.146f, -0.045f, -0.22f, -0.064f, -0.229f, -0.063f)
                    curveToRelative(0.02f, 0.013f, 0.181f, 0.072f, 0.459f, 0.172f)
                    curveToRelative(2.65f, 1.51f, 16.008f, 9.73f, 27.898f, 18.27f)
                    curveToRelative(1.94f, 1.41f, 4.1f, 3.03f, 6.43f, 4.76f)
                    curveToRelative(0.002f, 0.002f, 0.005f, 0.004f, 0.008f, 0.006f)
                    lineToRelative(-0.027f, 0.006f)
                    lineToRelative(-1.779f, 0.379f)
                    lineToRelative(8.6f, 4.871f)
                    lineToRelative(0.139f, 0.078f)
                    curveToRelative(1.742f, 1.333f, 3.536f, 2.755f, 5.441f, 4.23f)
                    curveToRelative(0.001f, 0.001f, 0.002f, 0.003f, 0.004f, 0.004f)
                    lineToRelative(-0.014f, 0.006f)
                    lineToRelative(-4.221f, 2.111f)
                    lineToRelative(15.35f, 6.219f)
                    lineToRelative(0.08f, 0.033f)
                    curveToRelative(2.794f, 2.096f, 5.8f, 4.242f, 8.859f, 6.447f)
                    lineToRelative(-0.018f, 0.01f)
                    lineToRelative(-4.602f, 2.701f)
                    lineToRelative(20.711f, 8.16f)
                    lineToRelative(0.051f, 0.02f)
                    curveToRelative(1.88f, 1.233f, 3.76f, 2.416f, 5.699f, 3.6f)
                    lineToRelative(-0.02f, 0.01f)
                    lineToRelative(-6.602f, 3.301f)
                    curveToRelative(12.864f, 3.87f, 23.452f, 7.891f, 34.791f, 12.699f)
                    horizontalLineToRelative(-0.02f)
                    lineToRelative(-8.432f, 2.92f)
                    curveToRelative(14.812f, 4.474f, 30.991f, 8.293f, 44.988f, 13.197f)
                    lineToRelative(-0.008f, 0.004f)
                    lineToRelative(-7.189f, 4.43f)
                    curveToRelative(11.356f, 1.924f, 22.792f, 2.67f, 32.447f, 4.596f)
                    lineToRelative(-2.268f, 6.424f)
                    lineToRelative(7.57f, 0.33f)
                    horizontalLineToRelative(0.022f)
                    lineToRelative(0.379f, 0.32f)
                    lineToRelative(0.006f, 0.008f)
                    curveToRelative(-0.009f, 0.001f, -0.017f, 0.001f, -0.025f, 0.002f)
                    curveToRelative(-11.529f, 1.088f, -24.241f, 0.811f, -34.48f, 0.959f)
                    lineToRelative(5.24f, 3.352f)
                    horizontalLineToRelative(0.049f)
                    lineToRelative(0.01f, 0.006f)
                    curveToRelative(-0.006f, 0.001f, -0.013f, 0.003f, -0.02f, 0.004f)
                    horizontalLineToRelative(-0.049f)
                    curveToRelative(-9.972f, 1.372f, -18.923f, 2.05f, -27.191f, 2.43f)
                    curveToRelative(5.579f, 4.212f, 3.756f, 3.194f, -0.981f, 4.76f)
                    curveToRelative(-5.419f, 0.595f, -10.84f, 1.187f, -16.26f, 1.779f)
                    lineToRelative(2.699f, 2.648f)
                    curveToRelative(-0.002f, 0.001f, -0.005f, 0.001f, -0.008f, 0.002f)
                    curveToRelative(-6.406f, 2.869f, -13.553f, 3.441f, -19.891f, 4.221f)
                    lineToRelative(2.531f, 2.104f)
                    curveToRelative(-3.89f, 1.778f, -8.189f, 2.709f, -12.002f, 3.627f)
                    lineToRelative(1.184f, 0.535f)
                    curveToRelative(-2.043f, 0.807f, -3.929f, 1.505f, -5.604f, 2.104f)
                    curveToRelative(-2.49f, 0.87f, -5.029f, 1.73f, -7.459f, 2.49f)
                    curveToRelative(-7.68f, 2.43f, -14.491f, 4.33f, -16.111f, 4.76f)
                    curveToRelative(1.95f, -0.16f, 10.711f, -0.699f, 20.061f, -0.809f)
                    curveToRelative(1.52f, -0.05f, 3.09f, -0.051f, 4.6f, -0.051f)
                    curveToRelative(1.76f, 0.0f, 3.743f, 0.058f, 5.934f, 0.107f)
                    lineToRelative(-0.924f, 0.912f)
                    lineToRelative(7.605f, -0.742f)
                    curveToRelative(1.56f, 0.102f, 3.168f, 0.165f, 4.877f, 0.213f)
                    lineToRelative(-1.672f, 2.85f)
                    lineToRelative(12.018f, -2.635f)
                    curveToRelative(0.058f, 0.001f, 0.104f, 0.003f, 0.162f, 0.004f)
                    curveToRelative(2.528f, 0.05f, 5.216f, 0.051f, 7.963f, 0.051f)
                    lineToRelative(-1.662f, 3.33f)
                    curveToRelative(6.882f, -1.965f, 14.196f, -3.301f, 21.051f, -3.92f)
                    curveToRelative(0.001f, -0.0f, 0.003f, 0.0f, 0.004f, 0.0f)
                    lineToRelative(-2.615f, 4.43f)
                    curveToRelative(13.31f, -3.974f, 16.099f, -5.067f, 26.494f, -6.701f)
                    lineToRelative(-3.854f, 4.941f)
                    curveToRelative(10.81f, -3.418f, 22.148f, -7.947f, 32.869f, -10.455f)
                    lineToRelative(-2.459f, 5.295f)
                    lineToRelative(19.838f, -9.822f)
                    curveToRelative(0.02f, -0.006f, 0.042f, -0.012f, 0.063f, -0.018f)
                    curveToRelative(0.604f, -0.141f, 1.226f, -0.333f, 1.752f, -0.482f)
                    lineToRelative(1.338f, 4.473f)
                    curveToRelative(9.459f, -7.189f, 21.169f, -11.545f, 31.328f, -15.826f)
                    curveToRelative(1.686f, 28.193f, 4.388f, 58.01f, 7.361f, 83.355f)
                    lineToRelative(12.891f, -0.32f)
                    curveToRelative(0.0f, 0.0f, -0.19f, -5.31f, -0.51f, -14.6f)
                    curveToRelative(-0.21f, -4.65f, -0.46f, -10.28f, -0.74f, -16.75f)
                    curveToRelative(-0.08f, -3.23f, -0.171f, -6.669f, -0.271f, -10.299f)
                    curveToRelative(-0.14f, -3.63f, -0.289f, -7.44f, -0.449f, -11.42f)
                    curveToRelative(-0.15f, -3.97f, -0.299f, -8.12f, -0.459f, -12.41f)
                    curveToRelative(-0.09f, -4.29f, -0.191f, -8.731f, -0.291f, -13.291f)
                    curveToRelative(-0.084f, -4.023f, -0.18f, -8.452f, -0.27f, -12.654f)
                    curveToRelative(0.003f, -0.003f, 0.007f, -0.003f, 0.01f, -0.006f)
                    curveToRelative(11.32f, -91.67f, 22.474f, -231.573f, 0.08f, -339.539f)
                    curveToRelative(-0.27f, -1.35f, -0.54f, -2.6f, -0.76f, -3.84f)
                    curveToRelative(-0.27f, -1.45f, -0.54f, -2.811f, -0.76f, -4.051f)
                    curveToRelative(-0.16f, -0.81f, -0.322f, -1.57f, -0.432f, -2.27f)
                    curveToRelative(-0.05f, -0.54f, -0.16f, -1.08f, -0.27f, -1.51f)
                    curveToRelative(-0.11f, -0.38f, -0.169f, -0.711f, -0.219f, -1.031f)
                    curveToRelative(-0.22f, -1.41f, -0.38f, -2.489f, -0.49f, -3.139f)
                    close()
                    moveTo(77.66f, 155.711f)
                    verticalLineToRelative(0.109f)
                    curveToRelative(0.0f, 0.0f, 0.051f, -0.001f, 0.051f, 0.049f)
                    lineToRelative(0.219f, 0.221f)
                    curveToRelative(-0.01f, -0.014f, -0.02f, -0.026f, -0.029f, -0.039f)
                    curveToRelative(-0.009f, -0.013f, -0.017f, -0.027f, -0.025f, -0.039f)
                    curveToRelative(-0.101f, -0.145f, -0.151f, -0.23f, -0.195f, -0.279f)
                    curveToRelative(-0.002f, -0.002f, -0.002f, -0.004f, -0.004f, -0.006f)
                    curveToRelative(-0.002f, -0.002f, -0.004f, -0.004f, -0.006f, -0.006f)
                    curveToRelative(-0.002f, -0.002f, -0.002f, -0.004f, -0.004f, -0.006f)
                    curveToRelative(-0.002f, -0.002f, -0.004f, -0.002f, -0.006f, -0.004f)
                    close()
                    moveTo(83.125f, 158.975f)
                    curveToRelative(-0.0f, 0.011f, 0.034f, 0.09f, 0.105f, 0.236f)
                    curveToRelative(-0.12f, -0.112f, -0.185f, -0.167f, -0.195f, -0.17f)
                    curveToRelative(0.01f, 0.023f, 0.139f, 0.167f, 0.375f, 0.42f)
                    curveToRelative(-0.169f, -0.304f, -0.267f, -0.47f, -0.285f, -0.486f)
                    close()
                    moveTo(76.029f, 161.527f)
                    curveToRelative(-0.001f, 0.01f, 0.036f, 0.086f, 0.111f, 0.232f)
                    curveToRelative(-0.32f, -0.3f, -0.24f, -0.19f, 0.18f, 0.24f)
                    curveToRelative(-0.187f, -0.325f, -0.29f, -0.49f, -0.291f, -0.473f)
                    close()
                    moveTo(56.129f, 391.533f)
                    lineTo(56.127f, 391.535f)
                    curveToRelative(0.005f, 0.005f, 0.061f, 0.016f, 0.174f, 0.035f)
                    curveToRelative(-0.103f, 0.011f, -0.158f, 0.018f, -0.168f, 0.022f)
                    curveToRelative(0.017f, 0.002f, 0.146f, -0.005f, 0.377f, -0.022f)
                    curveToRelative(-0.231f, -0.028f, -0.362f, -0.041f, -0.381f, -0.037f)
                    close()
                    moveTo(56.359f, 419.289f)
                    curveToRelative(-0.236f, 0.023f, -0.368f, 0.041f, -0.385f, 0.047f)
                    curveToRelative(0.006f, 0.003f, 0.063f, 0.002f, 0.176f, -0.006f)
                    curveToRelative(-0.105f, 0.032f, -0.157f, 0.052f, -0.164f, 0.057f)
                    curveToRelative(0.019f, -0.001f, 0.148f, -0.036f, 0.373f, -0.098f)
                    close()
                    moveTo(54.75f, 425.199f)
                    curveToRelative(-0.236f, 0.017f, -0.368f, 0.029f, -0.385f, 0.033f)
                    curveToRelative(0.01f, 0.002f, 0.066f, 0.002f, 0.174f, -0.002f)
                    curveToRelative(-0.105f, 0.032f, -0.157f, 0.051f, -0.164f, 0.057f)
                    curveToRelative(0.019f, -0.0f, 0.15f, -0.032f, 0.375f, -0.088f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF00a900)),
                    stroke = null,
                    strokeAlpha = 0.06f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveToRelative(477.166f, 296.266f)
                    lineToRelative(-0.05f, 0.05f)
                    lineToRelative(1.78f, 0.32f)
                    lineToRelative(-8.6f, 4.86f)
                    lineToRelative(-0.05f, 0.05f)
                    curveToRelative(-1.73f, 1.35f, -3.57f, 2.76f, -5.51f, 4.27f)
                    lineToRelative(4.22f, 2.11f)
                    lineToRelative(-15.35f, 6.22f)
                    lineToRelative(-0.05f, 0.05f)
                    curveToRelative(-2.87f, 2.11f, -5.78f, 4.22f, -8.87f, 6.43f)
                    lineToRelative(4.6f, 2.7f)
                    lineToRelative(-20.55f, 8.11f)
                    curveToRelative(-0.32f, 0.22f, -0.65f, 0.43f, -1.03f, 0.65f)
                    curveToRelative(-1.57f, 1.03f, -3.19f, 2.0f, -4.81f, 3.03f)
                    lineToRelative(6.54f, 3.3f)
                    lineToRelative(-26.06f, 8.11f)
                    lineToRelative(-0.05f, 0.05f)
                    horizontalLineToRelative(-0.05f)
                    curveToRelative(-0.05f, 0.0f, -0.05f, 0.05f, -0.11f, 0.05f)
                    curveToRelative(-2.76f, 1.57f, -5.62f, 2.97f, -8.49f, 4.49f)
                    lineToRelative(8.43f, 2.92f)
                    lineToRelative(-39.09f, 10.87f)
                    curveToRelative(-0.05f, 0.05f, -0.16f, 0.05f, -0.22f, 0.05f)
                    curveToRelative(-1.89f, 0.76f, -3.79f, 1.57f, -5.68f, 2.27f)
                    lineToRelative(7.24f, 4.43f)
                    lineToRelative(-30.01f, 3.78f)
                    horizontalLineToRelative(-0.05f)
                    curveToRelative(-0.87f, 0.27f, -1.62f, 0.54f, -2.43f, 0.81f)
                    lineToRelative(0.97f, 2.65f)
                    lineToRelative(16.76f, -0.16f)
                    lineToRelative(-5.19f, 3.51f)
                    curveToRelative(2.38f, 0.43f, 4.7f, 0.87f, 7.08f, 1.35f)
                    horizontalLineToRelative(0.11f)
                    lineToRelative(20.11f, 0.38f)
                    lineToRelative(-3.84f, 3.41f)
                    curveToRelative(1.62f, 0.43f, 3.24f, 0.87f, 4.87f, 1.3f)
                    curveToRelative(0.05f, 0.05f, 0.05f, 0.05f, 0.11f, 0.05f)
                    lineToRelative(16.22f, 1.41f)
                    lineToRelative(-2.6f, 2.65f)
                    curveToRelative(1.35f, 0.43f, 2.65f, 0.87f, 3.95f, 1.3f)
                    curveToRelative(1.24f, 0.43f, 2.49f, 0.81f, 3.73f, 1.24f)
                    horizontalLineToRelative(0.16f)
                    lineToRelative(12.16f, 1.19f)
                    lineToRelative(-2.49f, 2.22f)
                    curveToRelative(1.68f, 0.6f, 3.3f, 1.19f, 4.81f, 1.73f)
                    horizontalLineToRelative(0.05f)
                    lineToRelative(7.19f, 1.57f)
                    lineToRelative(-1.13f, 0.59f)
                    curveToRelative(2.0f, 0.7f, 3.95f, 1.35f, 5.62f, 1.95f)
                    curveToRelative(10.33f, 3.3f, 21.57f, 6.16f, 23.73f, 6.7f)
                    curveToRelative(-2.22f, -0.16f, -13.84f, -0.6f, -24.65f, -0.32f)
                    curveToRelative(-1.78f, 0.05f, -3.78f, 0.16f, -5.95f, 0.27f)
                    lineToRelative(0.92f, 0.87f)
                    lineToRelative(-7.14f, -0.49f)
                    horizontalLineToRelative(-0.16f)
                    curveToRelative(-1.68f, 0.05f, -3.41f, 0.16f, -5.19f, 0.27f)
                    lineToRelative(1.73f, 2.81f)
                    lineToRelative(-12.0f, -2.32f)
                    horizontalLineToRelative(-0.05f)
                    curveToRelative(-1.3f, 0.05f, -2.65f, 0.11f, -3.95f, 0.16f)
                    curveToRelative(-1.4f, 0.05f, -2.76f, 0.05f, -4.16f, 0.11f)
                    lineToRelative(1.73f, 3.3f)
                    lineToRelative(-15.84f, -3.24f)
                    lineToRelative(-0.16f, -0.05f)
                    horizontalLineToRelative(-0.22f)
                    curveToRelative(-1.62f, 0.0f, -3.24f, -0.05f, -4.92f, -0.11f)
                    lineToRelative(2.7f, 4.38f)
                    lineToRelative(-19.52f, -5.35f)
                    curveToRelative(-0.97f, -0.11f, -2.0f, -0.22f, -3.03f, -0.32f)
                    curveToRelative(-1.35f, -0.11f, -2.76f, -0.27f, -4.11f, -0.43f)
                    lineToRelative(4.0f, 4.87f)
                    lineToRelative(-28.6f, -8.76f)
                    curveToRelative(-0.32f, -0.05f, -0.65f, -0.11f, -0.92f, -0.22f)
                    curveToRelative(-1.24f, -0.22f, -2.43f, -0.49f, -3.62f, -0.7f)
                    lineToRelative(2.6f, 5.3f)
                    lineToRelative(-20.11f, -9.35f)
                    curveToRelative(-0.05f, 0.0f, -0.05f, 0.0f, -0.11f, -0.05f)
                    curveToRelative(-0.54f, -0.11f, -1.13f, -0.27f, -1.68f, -0.43f)
                    lineToRelative(-1.19f, 4.54f)
                    lineToRelative(-17.95f, -10.11f)
                    lineToRelative(-0.05f, -0.05f)
                    horizontalLineToRelative(-0.05f)
                    curveToRelative(-5.78f, -1.89f, -10.92f, -3.73f, -15.19f, -5.46f)
                    curveToRelative(0.05f, 2.7f, 0.11f, 5.51f, 0.16f, 8.16f)
                    curveToRelative(0.11f, 4.54f, 0.22f, 8.98f, 0.27f, 13.3f)
                    curveToRelative(0.16f, 4.27f, 0.32f, 8.43f, 0.49f, 12.38f)
                    curveToRelative(0.16f, 4.0f, 0.32f, 7.79f, 0.43f, 11.46f)
                    curveToRelative(0.11f, 3.62f, 0.22f, 7.03f, 0.27f, 10.27f)
                    curveToRelative(0.27f, 6.49f, 0.54f, 12.11f, 0.76f, 16.76f)
                    curveToRelative(0.32f, 9.3f, 0.49f, 14.6f, 0.49f, 14.6f)
                    lineToRelative(-5.35f, 0.11f)
                    verticalLineTo(33.345f)
                    curveToRelative(0.16f, 0.81f, 0.32f, 1.78f, 0.49f, 2.87f)
                    curveToRelative(0.32f, 1.78f, 0.7f, 3.95f, 1.19f, 6.33f)
                    curveToRelative(0.22f, 1.24f, 0.49f, 2.49f, 0.76f, 3.84f)
                    curveToRelative(1.62f, 7.84f, 3.78f, 17.57f, 6.43f, 26.98f)
                    curveToRelative(0.49f, 1.73f, 1.03f, 3.57f, 1.68f, 5.51f)
                    curveToRelative(0.27f, 0.97f, 0.6f, 2.0f, 0.97f, 3.03f)
                    curveToRelative(0.16f, 0.54f, 0.32f, 1.08f, 0.54f, 1.68f)
                    lineToRelative(2.11f, -1.84f)
                    lineToRelative(1.51f, 12.7f)
                    verticalLineToRelative(0.11f)
                    curveToRelative(0.97f, 2.81f, 1.95f, 5.84f, 2.97f, 8.92f)
                    lineToRelative(7.35f, -3.73f)
                    lineToRelative(-1.68f, 21.46f)
                    verticalLineToRelative(0.05f)
                    curveToRelative(1.35f, 4.54f, 2.7f, 9.14f, 4.05f, 13.95f)
                    lineToRelative(8.65f, -3.84f)
                    lineToRelative(-2.7f, 28.38f)
                    verticalLineToRelative(0.16f)
                    curveToRelative(0.6f, 2.92f, 1.19f, 5.89f, 1.73f, 8.92f)
                    horizontalLineToRelative(0.05f)
                    lineToRelative(11.25f, -5.78f)
                    lineToRelative(-7.19f, 35.09f)
                    curveToRelative(0.16f, 2.11f, 0.38f, 4.16f, 0.49f, 6.27f)
                    curveToRelative(0.11f, 1.78f, 0.22f, 3.62f, 0.32f, 5.41f)
                    curveToRelative(0.0f, 0.32f, 0.05f, 0.6f, 0.05f, 0.92f)
                    lineToRelative(12.22f, -8.11f)
                    lineToRelative(-13.19f, 51.42f)
                    lineToRelative(-0.05f, 0.16f)
                    verticalLineToRelative(0.22f)
                    curveToRelative(-0.22f, 2.7f, -0.43f, 5.3f, -0.7f, 7.95f)
                    lineToRelative(13.95f, -5.84f)
                    lineToRelative(-15.52f, 31.36f)
                    verticalLineToRelative(0.05f)
                    lineToRelative(2.0f, 3.73f)
                    curveToRelative(1.19f, -1.89f, 2.38f, -3.78f, 3.62f, -5.68f)
                    lineToRelative(0.11f, -0.16f)
                    lineToRelative(18.11f, -39.14f)
                    lineToRelative(2.92f, 10.33f)
                    curveToRelative(2.27f, -2.7f, 4.49f, -5.3f, 6.76f, -7.84f)
                    lineToRelative(0.05f, -0.05f)
                    lineToRelative(13.35f, -26.01f)
                    lineToRelative(3.57f, 8.49f)
                    curveToRelative(1.84f, -1.78f, 3.62f, -3.46f, 5.46f, -5.14f)
                    lineToRelative(0.05f, -0.05f)
                    lineToRelative(12.6f, -19.79f)
                    lineToRelative(3.03f, 6.11f)
                    curveToRelative(3.19f, -2.65f, 6.27f, -5.14f, 9.3f, -7.52f)
                    lineToRelative(9.79f, -14.76f)
                    lineToRelative(2.33f, 5.46f)
                    curveToRelative(2.11f, -1.62f, 4.16f, -3.14f, 6.11f, -4.65f)
                    lineToRelative(7.24f, -7.78f)
                    lineToRelative(0.32f, 2.11f)
                    curveToRelative(1.3f, -0.97f, 2.49f, -1.89f, 3.62f, -2.81f)
                    curveToRelative(1.19f, -0.92f, 2.27f, -1.78f, 3.3f, -2.6f)
                    curveToRelative(6.49f, -5.3f, 12.98f, -11.14f, 17.9f, -15.79f)
                    curveToRelative(4.43f, -4.11f, 7.68f, -7.35f, 8.76f, -8.43f)
                    curveToRelative(-0.81f, 1.35f, -3.14f, 5.57f, -6.0f, 11.19f)
                    curveToRelative(-3.08f, 5.89f, -6.76f, 13.35f, -10.0f, 20.76f)
                    curveToRelative(-1.03f, 2.38f, -2.16f, 5.03f, -3.3f, 8.0f)
                    verticalLineToRelative(0.05f)
                    lineToRelative(2.16f, -0.38f)
                    lineToRelative(-5.41f, 8.81f)
                    lineToRelative(-0.05f, 0.11f)
                    lineToRelative(-0.11f, 0.11f)
                    curveToRelative(0.0f, 0.05f, -0.05f, 0.05f, -0.05f, 0.11f)
                    curveToRelative(-0.81f, 2.16f, -1.68f, 4.43f, -2.6f, 6.76f)
                    curveToRelative(-0.05f, 0.05f, -0.05f, 0.16f, -0.11f, 0.22f)
                    horizontalLineToRelative(0.05f)
                    lineToRelative(6.0f, 0.6f)
                    lineToRelative(-11.57f, 13.3f)
                    lineToRelative(-0.11f, 0.11f)
                    curveToRelative(-1.35f, 3.24f, -2.76f, 6.54f, -4.22f, 9.95f)
                    curveToRelative(-0.16f, 0.32f, -0.32f, 0.59f, -0.43f, 0.92f)
                    lineToRelative(6.87f, 1.03f)
                    lineToRelative(-15.68f, 17.46f)
                    verticalLineToRelative(0.05f)
                    lineToRelative(-0.11f, 0.11f)
                    curveToRelative(-1.13f, 2.16f, -2.27f, 4.38f, -3.46f, 6.54f)
                    horizontalLineToRelative(0.05f)
                    lineToRelative(9.24f, 0.87f)
                    lineToRelative(-21.63f, 20.11f)
                    curveToRelative(0.0f, 0.0f, 0.0f, 0.05f, -0.05f, 0.05f)
                    curveToRelative(-1.3f, 2.11f, -2.7f, 4.16f, -4.16f, 6.27f)
                    curveToRelative(-0.49f, 0.76f, -1.03f, 1.51f, -1.57f, 2.27f)
                    horizontalLineToRelative(0.05f)
                    lineToRelative(11.03f, -0.27f)
                    lineToRelative(-33.25f, 28.33f)
                    lineToRelative(-0.11f, 0.11f)
                    lineToRelative(-0.05f, 0.05f)
                    curveToRelative(-0.7f, 0.81f, -1.41f, 1.62f, -2.16f, 2.38f)
                    curveToRelative(-0.7f, 0.81f, -1.4f, 1.57f, -2.22f, 2.38f)
                    verticalLineToRelative(0.22f)
                    lineToRelative(7.73f, 1.35f)
                    horizontalLineToRelative(0.05f)
                    lineToRelative(30.17f, -20.92f)
                    lineToRelative(-2.92f, 8.27f)
                    curveToRelative(2.97f, -1.3f, 6.0f, -2.54f, 8.98f, -3.73f)
                    lineToRelative(22.98f, -14.76f)
                    lineToRelative(-1.51f, 7.03f)
                    curveToRelative(2.22f, -0.76f, 4.43f, -1.46f, 6.6f, -2.11f)
                    lineToRelative(0.11f, -0.05f)
                    lineToRelative(19.25f, -10.54f)
                    lineToRelative(-0.76f, 5.24f)
                    curveToRelative(3.73f, -0.97f, 7.3f, -1.89f, 10.76f, -2.76f)
                    lineToRelative(14.65f, -7.79f)
                    lineToRelative(-0.97f, 4.6f)
                    curveToRelative(2.33f, -0.54f, 4.65f, -1.08f, 6.81f, -1.57f)
                    curveToRelative(0.05f, 0.0f, 0.05f, 0.0f, 0.11f, 0.0f)
                    lineToRelative(0.11f, -0.05f)
                    lineToRelative(9.14f, -3.46f)
                    lineToRelative(-0.81f, 1.57f)
                    curveToRelative(0.7f, -0.16f, 1.41f, -0.32f, 2.11f, -0.49f)
                    curveToRelative(0.7f, -0.16f, 1.4f, -0.32f, 2.05f, -0.49f)
                    curveToRelative(1.3f, -0.32f, 2.6f, -0.6f, 3.73f, -0.92f)
                    curveToRelative(14.27f, -3.68f, 29.19f, -8.7f, 32.06f, -9.73f)
                    curveToRelative(-2.6f, 1.51f, -15.95f, 9.73f, -27.84f, 18.27f)
                    curveToRelative(-1.99f, 1.4f, -4.1f, 3.02f, -6.42f, 4.75f)
                    close()
                }
            }
                .build()
        return customHashTagIconsWeed!!
    }

private var customHashTagIconsWeed: ImageVector? = null
