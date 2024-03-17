package com.broughapartments.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.broughapartments.ui.dashboard.Dashboard
import com.broughapartments.ui.explore.Explore
import com.broughapartments.ui.profile.Profile
import com.broughapartments.ui.wishlist.Wishlist

@Composable
fun AppNavigation(){
    val navController : NavHostController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                var selectedItem by remember { mutableIntStateOf(0) }

                listOfNavItems.forEachIndexed { index, item ->
                    NavigationBarItem(

                        label = { Text(item.title) },
                        selected = currentDestination?.hierarchy?.any{ it.route == item.route } == true,
                        icon = {
                            Icon(imageVector = if(selectedItem == index) {
                                item.selectedIcon
                            } else {
                                item.unselectedIcon
                            },
                                contentDescription = item.title)
                        },
                        onClick = {
                            selectedItem = index
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        },
    ) { paddingValues ->
        Text(
            modifier = Modifier.padding(paddingValues),
            text = "Example of a scaffold with a bottom app."
        )
        NavHost(
            navController = navController,
            startDestination = Screens.ExploreScreen.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Screens.ExploreScreen.name) {
                Explore()
            }
            composable(route = Screens.DashboardScreen.name) {
                Dashboard()
            }
            composable(route = Screens.WishlistScreen.name) {
                Wishlist()
            }
            composable(route = Screens.ProfileScreen.name) {
                Profile()
            }
        }
    }
}