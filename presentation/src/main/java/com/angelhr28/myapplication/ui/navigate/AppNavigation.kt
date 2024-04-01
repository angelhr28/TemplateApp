package com.angelhr28.myapplication.ui.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.angelhr28.myapplication.ui.features.detail.DetailScreen
import com.angelhr28.myapplication.ui.features.home.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

// Place the navigation tree here
    NavHost(navController = navController, startDestination = Destination.Home.route) {
        composable(Destination.Home.route) {
            HomeScreen(
                onNavigateToDetail = { recipeId ->
                    navController.navigate(
                        Destination.Detail.createNavRoute(recipeId),
                        navOptions { launchSingleTop = true }
                    )
                }
            )
        }

        composable(Destination.Detail.route) { backStackEntry ->
            val recipeId =
                requireNotNull(backStackEntry.arguments?.getString(Destination.Detail.argRecipeId))
            DetailScreen(
                recipeId = recipeId
            )
        }

    }
}
