package com.broughapartments.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                            .wrapContentSize(Alignment.TopStart)
                            .padding(16.dp)
                            .graphicsLayer(
                                translationX = 0f, // Adjust as needed
                                translationY = 0f  // Adjust as needed
                            )
//                            .background(Color.Blue, shape = RectangleShape)
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                Column {
                                    LocationInfo()
                                }
                                Column {
                                    Icon(
                                        modifier = Modifier.size(40.dp),
                                        imageVector = Icons.Filled.Favorite, contentDescription = "Favorite",
                                        tint = colorResource(id = R.color.primary_color))
                                }
                            }
                        }
                    }

                }
            
                Column {
                    Row(modifier = Modifier
                        .padding(15.dp, 10.dp, 15.dp, 0.dp),
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        ItemInfo(text = "5 Bedroom")
                        ItemInfo(text = "3 Bathrooms")
                        ItemInfo(text = "Terrance duplex")
                    }
                }

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)) {
                    Row {
                        Text(
                            text = "Fully furnished 3 bedroom duplex\n" +
                                "in Utako Estate.",
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Column(modifier = Modifier.padding(15.dp, 0.dp, 15.dp, 20.dp)) {
                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .height(1.5.dp)
                        .background(
                            color = colorResource(id = R.color.primary_color),
                            shape = RectangleShape
                        )
                    ){

                    }
                }

                Column(modifier = Modifier.padding(15.dp, 0.dp, 15.dp, 20.dp)) {
                    PriceInfo()
                }

        }
    }


}


