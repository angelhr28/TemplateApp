package com.angelhr28.myapplication.ui.navigate

import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Destination(val route: String) {
    data object Home : Destination("home")
    data object Detail : Destination("detail/{recipeId}") {
        const val argRecipeId = "recipeId"
        fun createNavRoute(recipeId: String): String = "detail/$recipeId"
        fun createNavArg() = navArgument(argRecipeId) { type = NavType.StringType }
    }
}

