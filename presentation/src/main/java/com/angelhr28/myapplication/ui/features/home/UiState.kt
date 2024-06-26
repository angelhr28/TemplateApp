package com.angelhr28.myapplication.ui.features.home

import com.angelhr28.domain.model.Recipe
import com.angelhr28.myapplication.Constants

data class UiState(
    val isLoading: Boolean = true,
    val recipes: List<Recipe> = emptyList(),
    var textToSearch: String = Constants.EMPTY_STRING,
    val selectedRecipeId: String? = null,
    val error: Throwable? = null
)
