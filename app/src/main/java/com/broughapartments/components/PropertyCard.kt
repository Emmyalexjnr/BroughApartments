package com.broughapartments.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.broughapartments.R

@Composable
fun PropertyCard() {
    Column(modifier = Modifier.padding(bottom = 20.dp)) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.white)),
        ) {

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)){
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(280.dp),
                        painter = painterResource(id = R.drawable.house1),
                        contentDescription = "House one",
                        contentScale = ContentScale.FillBounds
                    )
                    Box(
                        modifier = Modifier
//                            .size(250.dp, 80.dp)
                            .wrapContentSize(Alignment.TopStart)
                            .padding(16.dp)
                            .graphicsLayer(
                                translationX = 20f, // Adjust as needed
                                translationY = 20f  // Adjust as needed
                            )
                            .background(Color.Black, shape = RectangleShape)
                    ) {
                        Column {
                            Row {
                                Column {

                                }
                                Column {
                                    LocationInfo()
                                }
                            }
                        }
                        Text(
                            text = "Absolute Box ",
                            color = Color.White,
                            modifier = Modifier
                                .padding(8.dp)
                                .wrapContentWidth(Alignment.Start)
                        )
                    }

                }

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)) {
                    Row {
                        Text(text = "Fully furnished 3 bedroom duplex\n" +
                                "in Utako Estate.")
                    }
                }







        }
    }


}


