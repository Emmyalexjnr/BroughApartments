package com.broughapartments.components

import android.graphics.Color
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.broughapartments.R
@Composable
fun MyText(
    text: String,
    modifier: Modifier = Modifier,
//    color: Color = Color(R.color.primary_color),
    fontSize: TextUnit = 16.sp,
    textAlign: TextAlign = TextAlign.Start,
    fontFamily: FontFamily = nunitoFamily,
    fontWeight: FontWeight? = null
) {
    Text(
        text = text,
        fontFamily = fontFamily,
        modifier = modifier,
        fontSize = fontSize,
        textAlign = textAlign,
        fontWeight = fontWeight
    )
}

val nunitoFamily = FontFamily(
    Font(R.font.nunito_light, FontWeight.Light),
    Font(R.font.nunito_regular, FontWeight.Normal),
    Font(R.font.nunito_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.nunito_medium, FontWeight.Medium),
    Font(R.font.nunito_bold, FontWeight.Bold)
)