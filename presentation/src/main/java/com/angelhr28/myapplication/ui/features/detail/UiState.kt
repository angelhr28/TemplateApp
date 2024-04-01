package com.angelhr28.myapplication.ui.features.detail

import com.angelhr28.domain.model.Recipe

data class UiState(
    val recipe: Recipe? = null,
    val navigateToMap: Boolean = false,
    val error: Throwable? = null
)
