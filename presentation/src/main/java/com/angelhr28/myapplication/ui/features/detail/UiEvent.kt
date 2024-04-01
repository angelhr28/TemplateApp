package com.angelhr28.myapplication.ui.features.detail

sealed interface UiEvent {
    data class GetRecipe(val recipeId: String) : UiEvent
    data object ShowMapButtonClick : UiEvent
    data object MapShown : UiEvent
    data object ErrorShown : UiEvent
}
