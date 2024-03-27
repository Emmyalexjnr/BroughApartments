package com.broughapartments.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.broughapartments.R

@Composable
fun LocationInfo() {
    Column(verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier
            .background(
                color = colorResource(id = R.color.light_green),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(modifier = Modifier.size(18.dp),
                imageVector = Icons.Filled.LocationOn, contentDescription = "Property location")
            MyText(text = "TS1", fontSize = 12.sp)
        }
    }
}

@Composable
fun RentOrSaleInfo() {

    Box {

        Column(modifier = Modifier
            .offset(3.dp, 3.dp)
            .background(colorResource(id = R.color.primary_color), shape = RectangleShape)
            .padding(12.dp)

        ) {
            MyText(text = "For Sale", fontSize = 12.sp)
        }
        Column(
            modifier = Modifier
                .border(width = Dp.Hairline, colorResource(id = R.color.primary_color))
                .background(Color.White, shape = RectangleShape)
                .padding(11.dp)

        ) {
            MyText(text = "For Sale", fontSize = 12.sp)
        }
    }
}

@Composable
fun PriceInfo() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            MyText(text = "N7,000", fontSize = 22.sp, fontWeight = FontWeight.Bold)
            RentOrSaleInfo()
        }
    }
}

@Composable
fun ItemInfo(text: String) {
    Row(modifier = Modifier
        .background(
            color = colorResource(id = R.color.light_grey_200),
            shape = RoundedCornerShape(5.dp)
        )
        .padding(10.dp, 5.dp, 10.dp, 5.dp)) {
        MyText(text = text)
    }
}