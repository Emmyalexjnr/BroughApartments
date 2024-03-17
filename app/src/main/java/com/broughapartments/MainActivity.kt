package com.broughapartments

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.broughapartments.ui.theme.BroughApartmentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BroughApartmentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    BottomBar()
                }
            }
        }
    }
}

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badgeCount: Int? = null
)

//@Composable
//fun BottomBar() {
//    var selectedItem by remember { mutableIntStateOf(0) }
//    val items = listOf("Explore", "Artists", "Playlists")
//
//    Scaffold(
//        bottomBar = {
//            NavigationBar {
//                items.forEachIndexed { index, item ->
//                    NavigationBarItem(
//                        icon = { Icon(Icons.Filled.Favorite, contentDescription = item) },
//                        label = { Text(item) },
//                        selected = selectedItem == index,
//                        onClick = { selectedItem = index }
//                    )
//                }
//            }
//        },
//    ) { innerPadding ->
//        Text(
//            modifier = Modifier.padding(innerPadding),
//            text = "Example of a scaffold with a bottom app."
//        )
//    }
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BroughApartmentsTheme {
//        BottomBar()
    }
}


