package com.broughapartments.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.broughapartments.R

@Composable
fun LocationInfo() {
    Column {
        Row(modifier = Modifier
            .background(color = colorResource(id = R.color.primary_color))) {
            Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "Property location")
            Text(text = "TS1")
        }
    }
}